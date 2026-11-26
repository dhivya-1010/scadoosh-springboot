package com.phase6.task_management;

import com.phase6.task_management.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    StudentService studentService;
    ArrayList<Student> s = new ArrayList<>();

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedStudent);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return s;
    }

    @GetMapping("{id}")
    public Student getById(@PathVariable int id){
        for(Student x:s){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }
    @PutMapping("/update/{id}")
    public String updateId(@PathVariable int id, @RequestBody Student stu){
        for(Student x:s){
            if(x.getId()==id){
                x.setFirstName(stu.getFirstName());
                x.setLastName(stu.getLastName());
                return "Successfully updated";
            }
        }
        return "failed";
    }

    @DeleteMapping("/{id}")
    public String deleteId(@PathVariable int id, @RequestBody Student stu){
        for(Student x:s){
            if(x.getId()==id){
                s.remove(x);
                return  "deleted";
            }
        }
        return "not deleted";
    }
}
