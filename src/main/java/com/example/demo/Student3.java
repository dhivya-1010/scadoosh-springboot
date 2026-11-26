package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student3 {
    @Id
    private int rNumber;
    private String firstName;
    private String department;

    public int getrNumber() {
        return rNumber;
    }
}
