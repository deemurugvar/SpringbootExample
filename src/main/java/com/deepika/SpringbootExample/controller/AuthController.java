package com.deepika.SpringbootExample.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthController {
    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String,String> body){

        return "";
    }

    @PostMapping("/login")
    public String loginUser(@RequestBody Map<String,String> body){

        return "";
    }

}
