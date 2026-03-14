package com.capgemini.spring_core.xml_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	@Value("101")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Value("John")
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Value("20")
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
