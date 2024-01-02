package com.example.RestApi.Reposetories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestApi.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, String>{

}

