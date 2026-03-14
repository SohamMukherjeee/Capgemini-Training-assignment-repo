package com.capgemini.spring_core;

public class PojoClass {
 private Employee employee;
 private User user;
 
 public Employee getEmployee() {
	return employee;
 }
 public void setEmployee(Employee employee) {
	this.employee = employee;
 }
 public User getUser() {
	return user;
 }
 public void setUser(User user) {
	this.user = user;
 }
 @Override
 public String toString() {
	return "PojoClass [employee=" + employee + ", user=" + user + "]";
 }
 
}
