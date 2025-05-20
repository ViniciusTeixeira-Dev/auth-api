package com.authapi.controller;


import com.authapi.dto.LoginDTO;
import com.authapi.security.JWToken;
import com.authapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {

    @Autowired
    IUserService service;

    @PostMapping("/login")
    public ResponseEntity<JWToken> realizarLogin(@RequestBody LoginDTO dadosLogin){
        JWToken tk = service.login(dadosLogin);
        if(tk != null){
            return ResponseEntity.ok(tk);
        }
        return ResponseEntity.status(403).build();
    }
}
