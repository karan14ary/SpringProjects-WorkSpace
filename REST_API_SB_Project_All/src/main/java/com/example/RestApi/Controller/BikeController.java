package com.example.RestApi.Controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApi.Entity.Bike;
import com.example.RestApi.Services.BikeService;

@RestController
@RequestMapping("/bike")
public class BikeController {

BikeService bkserv;

public BikeController(BikeService bkserv) {
	super();
	this.bkserv = bkserv;
}
//creating bike object
@PostMapping
public String addBike(@RequestBody Bike b) {
	String msg=bkserv.addBike(b);
	return msg;
}
//getting specific bike
@GetMapping(value= "{eng_no}")
public Bike getBike(@PathVariable String eng_no) {
Bike b = bkserv.getBike(eng_no);
return b;
}
//getting all bikes
@GetMapping
public List<Bike> getAllBikes() {
List<Bike>lbike	=bkserv.getAllBike();
return lbike;
}
@PutMapping
public String updateBike(@RequestBody Bike b) {
	String msg=bkserv.updateBike(b);
  return msg;
}
@DeleteMapping(value="{eng_no}")
public String deleteBike(@PathVariable String eng_no) {
String msg= bkserv.deleteBike(eng_no);
return msg;
}
}
