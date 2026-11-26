package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Pen")
public class Pen implements Writer{
    public void write(){
        System.out.println("i got a pen");
    }
}
