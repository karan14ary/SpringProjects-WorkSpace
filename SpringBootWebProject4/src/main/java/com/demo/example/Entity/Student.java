package com.demo.example.Entity;

public class Student {
int sid;
String sname;
String  sbranch;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int sid, String sname, String sbranch) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.sbranch = sbranch;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public String getSbranch() {
	return sbranch;
}

public void setSbranch(String sbranch) {
	this.sbranch = sbranch;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + "]";
}

}
