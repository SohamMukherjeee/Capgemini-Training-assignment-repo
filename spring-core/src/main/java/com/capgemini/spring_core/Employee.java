package com.capgemini.spring_core;

import org.springframework.context.annotation.Lazy;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private double salary;
	

	public Employee() {
		System.out.println("Employee no-args");
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String gender, double salary) {
		super();
		System.out.println("Employee args");

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

// public int getId() {
//	return id;
// }
// public void setId(int id) {
//	this.id = id;
// }
// public String getName() {
//	return name;
// }
// public void setName(String name) {
//	this.name = name;
// }
// public String getGender() {
//	return gender;
// }
// public void setGender(String gender) {
//	this.gender = gender;
// }
// 
// public double getSalary() {
//	return salary;
// }
// public void setSalary(double salary) {
//	this.salary = salary;
// }
// 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}

}
