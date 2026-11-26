package com.phase6.task_management.Service;

import com.phase6.task_management.Repository.Repository;
import com.phase6.task_management.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final Repository repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents(){
        return repo.findAll();
    }
}
