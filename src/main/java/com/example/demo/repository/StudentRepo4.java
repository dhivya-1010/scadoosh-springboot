package com.example.demo.repository;

import com.example.demo.model.Student4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepo4 extends JpaRepository<Student4,Integer> {

    //1. ABSTRACT METHOD - won't work always, so we are going to another two methods
    List<Student4> findByGenderAndTech(String gender, String tech);
    List<Student4> findByTech(String tech);


    //2. NATIVE QUERY - HAVE TO MENTION EXPLICITELY - WORKS ON TABLES
    @Query(nativeQuery = true, value = "select * from Student4 where gender=:gender and tech=:tech")
    List<Student4> findByGenAndTech(@Param("gender") String gender, @Param("tech") String tech);


    //3. JPL QUERY - DEFAULT - WORKS ON FIELDS/ENTITIS
    @Query("select s from Student4 s where s.name=:name") // student is an entity here  s.getName - reference.getName - object, getter, setter blah blah
    List<Student4> findByName(@Param("name") String name);
}
/*
    DTO req, resp - validation and restriction
    relationship
    pagination
    logging
    spring secutity - jwt (authentication, authorization)
 */