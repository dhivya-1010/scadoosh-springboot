package com.example.demo.repository;

import com.example.demo.Student3;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Student3,Integer> {
}
