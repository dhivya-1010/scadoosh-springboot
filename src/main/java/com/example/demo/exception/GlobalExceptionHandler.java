package com.example.demo.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleValidation(
            MethodArgumentNotValidException ex){

        Map<String,String> errors = new HashMap<>();

        ex.getBindingResult()
                // i use ex because it is the object of MethodArgumentNotValidException

                .getFieldErrors()
                // go and check all fields

                .forEach(error ->
                        // travel through all fields using for each

                        errors.put(
                                error.getField(),   //which field
                                error.getDefaultMessage()  //which exception

                        ));

        return errors;
    }