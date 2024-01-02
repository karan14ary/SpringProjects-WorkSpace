package com.demo.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	@GetMapping("/formhandle")
	public String formHandle(@RequestParam String act) {
		switch (act) {
		case "ViewStudentDetails": {
			return"viewinfo";
			
		}
		case "AddStudent": {
			return"addstudent";
			
		}
		case "UpdateStudentDetails": {
			return"updatestudent";
			
		}
		case "RemoveStudent": {
			return"removestudent";
			
		}
		
		}
		return null;
	}

}