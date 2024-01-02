package com.example.Laptop.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Laptop.Entity.Laptop;
import com.example.Laptop.Repository.LaptopRepository;
@Service
public class LaptopServiceImplementation implements LaptopService {
	LaptopRepository laprepo;

	public LaptopServiceImplementation(LaptopRepository laprepo) {
		super();
		this.laprepo = laprepo;
	}

	@Override
	public String addLaptop(Laptop lap) {
		laprepo.save(lap);
		return "Laptop object Created";
	}

	@Override
	public Laptop getLaptop(int id) {
	Laptop lap=	laprepo.findById(id).get();
		return lap;
	}

	@Override
	public List<Laptop> getAllLaptop() {
		List <Laptop>listlap=laprepo.findAll();
		return listlap;
	}

	@Override
	public String updateLaptop(Laptop lap) {
		laprepo.save(lap);
		return "Laptop object Updated";
	}

	@Override
	public String deleteLaptop(int id) {
		laprepo.deleteById(id);
		return "Laptop Object deleted";
	}

}
