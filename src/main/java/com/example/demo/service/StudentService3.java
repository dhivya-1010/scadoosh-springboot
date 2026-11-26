package com.example.demo.service;

import com.example.demo.repository.Repository;
import org.springframework.stereotype.Service;

@Service
public class StudentService3 {

    Repository r;
    public String getAllStud() {
        return r.findAll().toString();
    }
}
