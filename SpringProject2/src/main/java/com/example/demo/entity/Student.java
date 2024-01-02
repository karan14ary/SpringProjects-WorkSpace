package com.example.demo.entity;

public class Student {
	String kod_Id;
	String name;
	int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String kod_Id, String name, int age) {
		super();
		this.kod_Id = kod_Id;
		this.name = name;
		this.age = age;
	}
	public String getKod_Id() {
		return kod_Id;
	}
	public void setKod_Id(String kod_Id) {
		this.kod_Id = kod_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [kod_Id=" + kod_Id + ", name=" + name + ", age=" + age + "]";
	}


}
