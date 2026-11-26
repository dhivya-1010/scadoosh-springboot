package com.phase6.task_management.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class initial {
    @GetMapping("/api")
    public String show(){
        return "hello dhanushya";
    }
    @GetMapping("/tasks")
    public List<String> getTasks(){
        ArrayList<String> l = new ArrayList<>();
        l.add("go");
        l.add("come");
        l.add("stay");
        return l;
    }
}
