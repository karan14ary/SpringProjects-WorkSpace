package com.demo.example.DataController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DataController {

	@GetMapping("/view")
	public String viewInfo() {
		return "viewinfo";
	}
}
