package com.capgemini.spring_core;

import org.springframework.context.annotation.Lazy;


public class User {
 private int id;
 private String name;
 private String email;
 private Employee employee;
 
 public User() {
	super();
	System.out.println("User no-args");
	// TODO Auto-generated constructor stub
 }
 public User(int id, String name, String email, Employee employee) {
	super();
	System.out.println("User args");
	this.id = id;
	this.name = name;
	this.email = email;
	this.employee = employee;
}
 
 public Employee getEmployee() {
	return employee;
}
 public void setEmployee(Employee employee) {
	this.employee = employee;
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
 public String getEmail() {
	return email;
 }
 public void setEmail(String email) {
	this.email = email;
 }
 @Override
 public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", employee=" + employee + "]";
 }
 
 
}
