package com.authapi.service;

import com.authapi.dto.LoginDTO;
import com.authapi.model.User;
import com.authapi.security.JWToken;

public interface IUserService {

    public User create(User user);
    public JWToken login(LoginDTO dto);
}
