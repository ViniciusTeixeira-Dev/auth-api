package com.authapi.controller;

import com.authapi.model.User;
import com.authapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.authapi.service.IUserService;


@RestController
public class UserRegister {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private IUserService service;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return ResponseEntity.status(201).body(service.create(user)).getBody();
    }

}
