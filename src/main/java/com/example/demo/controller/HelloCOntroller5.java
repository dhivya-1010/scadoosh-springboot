package com.example.demo.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller5 {
    @GetMapping("helloo")
    public String greeet(HttpSession session){
        System.out.println(session.getId());
        return "helooooo";
    }

    @GetMapping("homepage")
    public String home(HttpSession session){
        System.out.println(session.getId());
        return "welcome home";
    }
}
