package com.example.demo.service;

import com.example.demo.model.Student2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class StudentService2 {

    List<Student2> students = new ArrayList<>(
            Arrays.asList(
                    new Student2(1,"dhivya","springboot"),
                    new Student2(3,"abc","react")
            )
    );
    public List<Student2> getAllStudents(){
            return students;
    }

//    public List<Student2> getStudentById(int rno) {
//        //return Collections.singletonList(students.get(0));
//        return students.get(0);
//    } ----------------->> this is a mistake, see the RETURN TYPE, it should not be a list

//        public Student2 getStudentById(int rno) {
//        //return Collections.singletonList(students.get(0));
//        return students.get(0);
//    }

    public Student2 getStudentById(int rno){
        int index = -1;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rno){
                index=i;
            }
        }
        return (index!=-1)? students.get(index):new Student2(0,"","");
    }

    public String addStudent3(Student2 std) {
        students.add(std);
        return "added successfully";
    }

    public String updateStudent(Student2 std) {
        int index = 0;
        boolean ex = false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==std.getRno()){
                index=i;
                ex = true;
                break;
            }
        }
        if(ex){
            students.set(index,std);
            return "updated successfully";
        }
        return "no suchd ata";
    }

    public String deleteStud(int rollNo) {
        int index = 0;
        boolean ex = false;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRno()==rollNo){
                index=i;
                ex = true;
                break;
            }
        }
        if(ex){
            //students.remove(students.indexOf(index));
            students.remove(index);
            return "deleted successfully";
        }
        return "no such student";
    }
}