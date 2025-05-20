package com.authapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping("/helloUser")
    public String HelloUser(){
        return "Hello User";
    }

    @GetMapping("/helloAdmin")
    public String HelloAdmin() {
        return "Hello Admin";
    }

    @GetMapping("/helloMaster")
    public String HelloMaster(){
        return "Hello Master";
    }



}
