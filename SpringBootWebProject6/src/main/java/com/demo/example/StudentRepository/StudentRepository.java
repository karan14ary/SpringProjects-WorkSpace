package com.demo.example.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
