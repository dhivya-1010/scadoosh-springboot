package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //for getter setter from lambok
@AllArgsConstructor //for constructor
@NoArgsConstructor //non param constructor
@Entity //object will be converted into relation (table)
public class Student4 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO GENERATE
    private Integer rno;
    //@NotBlank(message = "name cannot be empty and also empty space is also not allowed")
    private String name;
    //@NotBlank(message = "enter gender")
    private String gender;
    //@NotBlank(message = "enter tech")
    private String tech;
    @Email
    private String email;
    private String password;

}
