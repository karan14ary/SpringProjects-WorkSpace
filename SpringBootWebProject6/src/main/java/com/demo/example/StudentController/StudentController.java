package com.demo.example.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.example.Entity.Student;
import com.demo.example.StudentService.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService sserv;
	@GetMapping("/fetchAll")
	public String fetchAllStudent(Model model) {
		List<Student> slist=sserv.fetchAllStudent();
		model.addAttribute("students", sserv.fetchAllStudent());
		//return slist.toString();
		return "viewstudent";
	}

}
