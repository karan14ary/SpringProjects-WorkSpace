package com.SpringBootProject.PostMan.Entity;

public class Laptop {
String slNo;
String brand;
int cost;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(String slNo, String brand, int cost) {
	super();
	this.slNo = slNo;
	this.brand = brand;
	this.cost = cost;
}
public String getSlNo() {
	return slNo;
}
public void setSlNo(String slNo) {
	this.slNo = slNo;
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
	return "Laptop [slNo=" + slNo + ", brand=" + brand + ", cost=" + cost + "]";
}

}
