package com.example.demo.service;

import com.example.demo.model.Student4;
import com.example.demo.repository.StudentRepo4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService4 {
    @Autowired
    StudentRepo4 sr4;
    public List<Student4> getStudent4() {

        return sr4.findAll();
    }

    public String addStud4(Student4 std4) {
        sr4.save(std4);
        return "added successfully";
    }

    public Student4 getStud4ByNo(Integer rno) {

        return sr4.findById(rno).orElse(new Student4());
    }

    public String updateStud4(Student4 std4) {

        sr4.save(std4);   //save will work for both post and put
        return "updated successfully";
    }

    public String deleteStud4(Integer rno) {
        sr4.deleteById(rno);
        return "deleted successfully";
    }

    public String deleteAllStud4() {
        sr4.deleteAll();
        return "everything deleted";
    }

    public List<Student4> getCustomStud4(String gender,String tech) {
        return sr4.findByGenderAndTech(gender, tech);
    }

    public List<Student4> getByTech(String tech) {
        return sr4.findByTech(tech);
    }

    public List<Student4> getStudentByGenAndTech(String gender, String tech) {
        return sr4.findByGenAndTech(gender, tech);
    }

    public List<Student4> getStudentByName(String name) {
        return sr4.findByName(name);
    }
}
