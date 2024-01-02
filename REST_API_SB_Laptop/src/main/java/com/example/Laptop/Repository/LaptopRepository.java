package com.example.Laptop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Laptop.Entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
