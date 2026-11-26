package com.example.demo.controller;

import com.example.demo.dto.LoginRequest;
import com.example.demo.utility.JwtApplication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/loginJwt")
    public String login(@RequestBody LoginRequest request){

        return "dhivya".equals(request.getUsername())
                && "1234".equals(request.getPassword())
                ? JwtApplication.generateToken(request.getUsername())
                : "invalid credentials";
    }

    @GetMapping("/helloJwt")
    public String hello(@RequestHeader("Authorization") String token){

        String username =
                JwtApplication.validateToken(
                        token.replace("Bearer ", "")
                );

        return "hello " + username;
    }
}