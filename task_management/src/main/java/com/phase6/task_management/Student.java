package com.phase6.task_management;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor   //complete the requirement of parameterized constructor
@NoArgsConstructor   //complete the requirement of default constructor
@Table(name="student table")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;

}