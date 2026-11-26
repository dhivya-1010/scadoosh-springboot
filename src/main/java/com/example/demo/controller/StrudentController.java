package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentController {
    private int age;
    private String fname;
    private String lname;

    public StrudentController() {
    }

    public StrudentController(int age, String fname, String lname) {
        this.age = age;
        this.fname = fname;
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Autowired
    StudentService ss;

    @GetMapping("age")
    public int getStudentAge(){
        return ss.getAge();
    }

    @GetMapping("fname")
    public String getStudentFname(){
        return ss.getFname();
    }

    @GetMapping("lname")
    public String getStudentLname(){
        return ss.getLname();
    }

    @PostMapping("addStudent")
    public StrudentController addStudent(@RequestBody StrudentController sss){
        return sss;
    }
}
