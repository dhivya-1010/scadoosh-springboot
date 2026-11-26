package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public int getAge(){
        return 21;
    }

    public String getFname(){
        return "Dhivya";
    }

    public String getLname(){
        return "V";
    }

    public String addStudent(String fname){
        return fname + " added successfully";
    }
}
