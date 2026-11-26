package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String greeting() {
        return "welcome";
    }

    public String getAbout(){
        return "about is here";
    }
    public String getLecture(){
        return "lecture is here";
    }
}
