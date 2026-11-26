package com.phase6.task_management.Repository;

import com.phase6.task_management.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Integer> {

    Student findById();
}
