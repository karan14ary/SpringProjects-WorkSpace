package com.example.Laptop.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Laptop.Entity.Laptop;
import com.example.Laptop.Service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
	LaptopService lapserv;
	
public LaptopController(LaptopService lapserv) {
		super();
		this.lapserv = lapserv;
	}

@PostMapping
public String createLaptop(@RequestBody Laptop lap) {
	String msg=lapserv.addLaptop(lap);
	return msg;
}
@GetMapping(value= "{id}")
public Laptop getLaptop(@PathVariable int id) {
	Laptop lap=lapserv.getLaptop(id);
	return lap;
}
@GetMapping
public List<Laptop> getAllLaptop() {
	List<Laptop>listlap=lapserv.getAllLaptop();
	return listlap;
}
@PutMapping
public String updateLaptop(@RequestBody Laptop lap) {
	String msg=lapserv.updateLaptop(lap);
	return msg;
}
@DeleteMapping(value="{id}")
public String deleteLaptop(@PathVariable int id) {
	String msg=lapserv.deleteLaptop(id);
	return msg;
}
}
