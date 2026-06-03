package com.example.demo.controller;

import com.example.demo.dto.StudentDto4;
import com.example.demo.model.Student4;
import com.example.demo.service.StudentService4;
import jakarta.validation.Valid;
import org.hibernate.validator.constraints.ParameterScriptAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController4 {

    @Autowired
    StudentService4 s4;
    @GetMapping("getstudent4")
    public List<Student4> getStudent4(){
        return s4.getStudent4();
    }
    @GetMapping("getUniqstudent4/{rno}")
    public Student4 getStud4ByNo(@PathVariable("rno") Integer rno){  //if both are same name, can use like (@PathVariable int rno)

        return s4.getStud4ByNo(rno);
    }

    @PostMapping("addStudent4")
    public String addStud4(@Valid @RequestBody Student4 std4){

        return s4.addStud4(std4);
    }

    @PutMapping("updateStudent4")
    public String updateStud4(@RequestBody Student4 std4){
        return s4.updateStud4(std4);
    }

    @DeleteMapping("deleteStudent4/{rno}")
    public String deleteStud4(@PathVariable("rno") Integer rno){
        return s4.deleteStud4(rno);
    }
    @DeleteMapping("delStudent4")
    public String deleteAllStud4(){
        return s4.deleteAllStud4();
    }

    @GetMapping("Cstudents4/customGet")
    public List<Student4> getCustomStud4(@Param("gender") String gender, @Param("tech") String tech){
        return s4.getCustomStud4(gender,tech);
    }

    @GetMapping("getByTech/{tech}")
    public List<Student4> getByTech(@PathVariable("tech") String tech){
        return s4.getByTech(tech);
    }

    /*
QUERY - native query and jpql query

    -> native query - in tables, (field)
    -> JPQL (Java Persistent Query Language) - in entity/object  (column - particular)
 */

    //1. NATIVE QUERY
    @PostMapping("student4/filter")
    public List<Student4> getStudentByNameAndGen(@Param("gender") String gender, @Param("tech") String tech){
        return s4.getStudentByGenAndTech(gender,tech);
    }

    //2. JPQL
    @GetMapping("student4/jpql")
    public  List<Student4> getStudentByName(@RequestParam String name){
        return  s4.getStudentByName(name);
    }

    //  DTO
    @GetMapping("studentDto/{rno4}")
    public StudentDto4 getStudDto(@PathVariable("rno4") int rno4){
        return s4.getStudByDto(rno4);
    }

    //DTO
//    @PostMapping("addStudent4")
//    public StudentResponseDto addStudent(
//            @RequestBody StudentRequestDto dto){
//
//        return s4.addStudent(dto);
//    }

    @GetMapping("pagination")
    //REQUESTPARAM
    public Page<Student4> getPageStud(@RequestParam("page") int page,@RequestParam("size") int size){ //for this page, this number of data - page, size
        return s4.getPageStud(page,size);
    }




}

//custom queries - using method 1 way , using queries 2 ways - abstract method
//JPQ - entity query