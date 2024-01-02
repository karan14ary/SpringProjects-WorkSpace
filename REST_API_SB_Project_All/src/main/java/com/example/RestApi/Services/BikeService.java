package com.example.RestApi.Services;
import java.util.*;

import com.example.RestApi.Entity.Bike;

public interface BikeService {

	String addBike(Bike b);
	Bike getBike(String eng_no);
	List<Bike>getAllBike();
	String updateBike(Bike b);
	String deleteBike(String eng_no);
}
