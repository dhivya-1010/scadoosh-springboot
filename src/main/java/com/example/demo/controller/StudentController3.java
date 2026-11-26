package com.example.demo.controller;

import com.example.demo.model.Student2;
import com.example.demo.service.StudentService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class StudentController3 {

    @Autowired
    StudentService3 std3;

    @GetMapping("studentDB")
    public String getAllStud(){
        return std3.getAllStud();
    }
}
