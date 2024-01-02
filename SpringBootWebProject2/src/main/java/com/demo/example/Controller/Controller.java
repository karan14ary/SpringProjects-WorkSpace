package com.demo.example.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/marks")
public class Controller {
	@PostMapping
	public String getPercentage(@RequestParam String name,@RequestParam int marks1,@RequestParam int marks2,@RequestParam int marks3,@RequestParam int marks4,@RequestParam int marks5) {	
		int obtainedMarks=(marks1+marks2+marks3+marks4+marks5);
		double percentage=  (obtainedMarks/500.0)*100;
		return	(name+" has obtained :"+String.format("%.2f",percentage)+"%");
		
	}

}
