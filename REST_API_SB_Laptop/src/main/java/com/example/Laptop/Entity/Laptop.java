package com.example.Laptop.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
int id;
String name;
int cost;
public Laptop() {
	super();
	// TODO Auto-generated constructor stub
}
public Laptop(int id, String name, int cost) {
	super();
	this.id = id;
	this.name = name;
	this.cost = cost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Laptop [id=" + id + ", name=" + name + ", cost=" + cost + "]";
}

}
