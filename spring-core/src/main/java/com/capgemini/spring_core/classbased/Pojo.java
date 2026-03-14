package com.capgemini.spring_core.classbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Pojo {
	@Autowired
	private Car car;
	@Autowired
	private Bike bike;

	@Override
	public String toString() {
		return "Pojo [car=" + car + ", bike=" + bike + "]";
	}

}
