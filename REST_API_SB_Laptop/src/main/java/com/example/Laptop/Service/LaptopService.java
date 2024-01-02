package com.example.Laptop.Service;
import java.util.*;

import com.example.Laptop.Entity.Laptop;

public interface LaptopService {
String addLaptop(Laptop lap);
Laptop getLaptop(int id);
List<Laptop>getAllLaptop();
String updateLaptop(Laptop lap);
String deleteLaptop(int id);
}
