package com.demo.example.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.demo.example.Entity.Student;

@RestController
public class Controller {
	
	Student s1;
	@PostMapping("/add")
	public String addStudent(@RequestParam int sid,@RequestParam String sname,@RequestParam String sbranch) {
		this.s1=s1;
		return "Student Added";
		
	}
	@GetMapping("/update")
	public String updateStudent(@RequestParam int sid,@RequestParam String sname,@RequestParam String sbranch) {
		this.s1=s1;
		return "Student updated";
		
	}
	@GetMapping("/view")
	public Student viewStudent(@RequestParam int sid) {
		this.s1=s1;
		return s1;
	}
	@GetMapping("/remove")
	public String removeStudent(@RequestParam int sid)
	{
		s1=null;
		return "Student remove";
	}

	}