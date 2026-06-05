package com.example.demo.utility;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {
    public static String generateToken(String username) {
        return "dummy-token";
    }

    public static String validateToken(String token) {
        return "dhivya";
    }
}
