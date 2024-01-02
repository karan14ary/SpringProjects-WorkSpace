package com.example.RestApi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
@Id
String eng_no;
String brand;
int cost;
public Bike() {
	super();
	// TODO Auto-generated constructor stub
}
public Bike(String eng_no, String brand, int cost) {
	super();
	this.eng_no = eng_no;
	this.brand = brand;
	this.cost = cost;
}
public String getEng_no() {
	return eng_no;
}
public void setEng_no(String eng_no) {
	this.eng_no = eng_no;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Bike [eng_no=" + eng_no + ", brand=" + brand + ", cost=" + cost + "]";
}
}
