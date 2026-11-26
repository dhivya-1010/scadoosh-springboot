package com.example.demo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller5 {
//    @GetMapping("helloo")
//    public String greeet(HttpSession session){
//        System.out.println(session.getId());
//        return "helooooo";
//    }
//
//    @GetMapping("homepage")
//    public String home(HttpSession session){
//        System.out.println(session.getId());
//        return "welcome home";
//    }

//    @GetMapping("helloo")
//    public String greeet(HttpSession session){
//        System.out.println(session.getId());
//        return "helooooo";
//    }
////SERVLET - SERVER SIDE JAVA CLASS WHICH IS AVAILABLE IN SERVER, GIVES RESPONSES FOR REQUESTS (THE ACTUAL PROCESSORS)
//    @GetMapping("homepage")
//    public String home(HttpServletRequest request){
//        System.out.println(request.getSession().getId());
//        return "welcome home";
//    }
//}

@GetMapping("helloo")
public String greeet(HttpServletRequest request){
    System.out.println(request.getSession().getId());
    return "helooooo+ "+ request.getSession().getId();
}
    //SERVLET - SERVER SIDE JAVA CLASS WHICH IS AVAILABLE IN SERVER, GIVES RESPONSES FOR REQUESTS (THE ACTUAL PROCESSORS)
    @GetMapping("homepage")
    public String home(HttpServletRequest request){
        System.out.println(request.getSession().getId());
        return "welcome home "+ request.getSession().getId();
    }
}
