package com.example.RestApi.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.RestApi.Entity.Bike;

@RestController
@RequestMapping("/bike")
public class BikeController {
	Bike bk;
	//create
	@PostMapping
	public String createBike(@RequestBody Bike bk) {
		this.bk=bk;
		return"Bike Object Created";
	}
	//Retrieve
	@GetMapping(value="{eng_no}")
	public Bike getBike(@PathVariable String eng_no) {
		this.bk=bk;
		return bk;
	}
	//Update
	@PutMapping
	public String updateBike(@RequestBody Bike bk) {
		this.bk=bk;
		return"Bike Object Updated";
	}
	//Delete
	@DeleteMapping (value="{eng_no}")
	public String deleteBike(@PathVariable String eng_no) {
		bk=null;
		return"Bike Object deleted";
	}

}
