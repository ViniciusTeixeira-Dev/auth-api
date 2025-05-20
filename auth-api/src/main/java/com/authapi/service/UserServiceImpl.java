package com.authapi.service;

import com.authapi.dto.LoginDTO;
import com.authapi.model.User;
import com.authapi.repository.UserRepository;
import com.authapi.security.JWToken;
import com.authapi.security.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepository repo;

    @Override
    public User create(User usuario) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String novaSenha = encoder.encode(usuario.getPassword());
        usuario.setPassword(novaSenha);
        return repo.save(usuario);
    }

    @Override
    public JWToken login(LoginDTO dto) {
        User res = repo.findByUsername(dto.username());

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(dto.password(), res.getPassword())){
            return TokenUtil.encode(res);
        }
        return null;
    }
}
