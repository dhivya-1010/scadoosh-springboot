package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService s;
    @GetMapping("/")
    public String greet(){ //have only end-points (commented out the sys.out)
        //return "greeting";
        return s.greeting();
    }

    @GetMapping("about")
    public String aboutus(){  //have only end-points (commented out the sys.out)
        //return "springboot course";
        return s.getAbout();
    }

    @GetMapping("/about/lecture")
    public String lec(){  //have only end-points (commented out the sys.out)
        //return "welcome to lecture 1";
        return s.getLecture();
    }
}
