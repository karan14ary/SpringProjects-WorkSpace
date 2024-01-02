package com.SpringBootProject.PostMan.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.SpringBootProject.PostMan.Entity.Laptop;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	Laptop lap;
	@PostMapping
	public String createLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Laptop is created";
	}
	@GetMapping(value="{slNo}")
	public Laptop readLaptop(@PathVariable String slNo) {
		return lap;
	}
	@PutMapping
	public String updateLaptop(@RequestBody Laptop lap) {
		this.lap=lap;
		return "Laptop is updated";
	}
	@DeleteMapping(value="{slNo}")
	public String deleteLaptop(@PathVariable String slNo) {
		lap=null;
		return"Laptop object deleted";
	}
	
		
}
	

