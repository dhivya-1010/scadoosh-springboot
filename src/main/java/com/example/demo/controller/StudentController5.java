package com.example.demo.controller;

import com.example.demo.model.Student5;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController5 {

    List<Student5> l = new ArrayList<>(
            Arrays.asList(
                    new Student5(1,"dhivya","javaa"),
                    new Student5(2,"vasp","python")
            )
    );
    @GetMapping("student5")
    public List<Student5> getAllStud(){
        return l;
    }

    @PostMapping("student5")
    public String addStud(@RequestBody Student5 std){
        l.add(std);
        return "added";
    }
}
