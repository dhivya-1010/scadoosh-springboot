package com.example.demo.controller;

import com.example.demo.model.Student2;
import com.example.demo.service.StudentService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     //object created in ioc constructor
public class StudentController2 {
    @Autowired
    StudentService2 s2;  //s2 is not and object, it is an object reference

    @GetMapping("getAllStudents")  //api endpoints
    public List<Student2> getAllStudents(){
        return s2.getAllStudents();      //without @PathVariable
    }
//    @GetMapping("getStudentById/{rno}")
//    public Student2 getStudentById(@PathVariable("rno") int rollNo){
//        return s2.getStudentById(rollNo);  //with @PathVariable


    @GetMapping("getStudentById/{rno}")
    public Student2 getStudentById(@PathVariable("rno") int rollNo){
        return s2.getStudentById(rollNo);
    }

    @PostMapping("addStudent2")
    public String addStudent3(@RequestBody Student2 std){
        s2.addStudent3(std);
        return "success";
    }

    @PutMapping("updateStudent")
    public String updateStudent(@RequestBody Student2 std){
        return s2.updateStudent(std);
        //return "updated successfully";
    }

    @DeleteMapping("delete/{rno}")
    public String deleteStud(@PathVariable("rno") int rollNo){
        return s2.deleteStud(rollNo);
    }
}

