package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
@RestController
@RequestMapping("/controller")
public class Controller {
@GetMapping(value="{kod_id}")
public Student getInfo(@PathVariable String kod_id) {
	Student s1=new Student(kod_id,"Karan",22);
	return s1;
}
}
