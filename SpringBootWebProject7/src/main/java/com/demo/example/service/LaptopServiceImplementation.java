package com.demo.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.example.Repository.LaptopRepository;
import com.demo.example.entity.Laptop;
@Service
public class LaptopServiceImplementation  implements LaptopService{
	@Autowired
	LaptopRepository lrepo;
	@Override
	public List<Laptop> getAllLaptop() {
		
		return lrepo.findAll();
	}

}
