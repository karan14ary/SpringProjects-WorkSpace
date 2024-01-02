package com.example.RestApi.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.RestApi.Entity.Bike;

import com.example.RestApi.Reposetories.BikeRepository;
@Service
public class BikeServiceImplementation implements BikeService{
BikeRepository bkrepo;

	
	public BikeServiceImplementation(BikeRepository bkrepo) {
	super();
	this.bkrepo = bkrepo;
}

	@Override
	public String addBike(Bike b) {
		bkrepo.save(b);
		return "Bike is Added";
	}

	@Override
	public Bike getBike(String eng_no) {
		Bike b=bkrepo.findById(eng_no).get();
		return b;
	
	}

	@Override
	public List<Bike> getAllBike() {
		List <Bike>lbike=bkrepo.findAll();
		return lbike;
	}

	@Override
	public String updateBike(Bike b) {
		bkrepo.save(b);
		return "Bike object Updated";
	}

	@Override
	public String deleteBike(String eng_no) {
		bkrepo.deleteById(eng_no);
		return "Bike object Deleted";
	}
	

}
