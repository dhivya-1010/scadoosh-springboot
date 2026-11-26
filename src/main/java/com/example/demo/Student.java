package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   //conveying my needs to springboot
@Scope("prototype")
public class Student {
    //Pen p = new Pen();

    //-> FIELD IJECTION
//    @Autowired
//    Pen p;


//    //-> CONSTRUCTOR INJECTION
//    Pen p;
//    @Autowired
//    public Student(Pen p){
//        this.p=p;
//    }

    //-> SETTER INJECTION
//    Pen p;
//
//    @Autowired
//    public void setP(Pen p) {
//        this.p = p;
//    }

    @Autowired
    @Qualifier("Pen")
    Writer w;

    public void setAge(int age) {
        this.age = age;
    }

    int age;
    public void study(){
        System.out.println("I am doing engineering");
    }
    public Student(){
        System.out.println("Student object created");
    }


    public void writeExam(){
        w.write();
    }
}
