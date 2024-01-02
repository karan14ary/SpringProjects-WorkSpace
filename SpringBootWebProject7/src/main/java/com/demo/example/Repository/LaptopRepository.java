package com.demo.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
