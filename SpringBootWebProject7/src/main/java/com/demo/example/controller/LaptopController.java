package com.demo.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.example.service.LaptopService;

@Controller
public class LaptopController {
	@Autowired
	LaptopService lserv;
	@GetMapping("/handler")
	public String getAll(Model model) {
		model.addAttribute("laptops", lserv.getAllLaptop());
		return "viewlaptop";
	}

}
