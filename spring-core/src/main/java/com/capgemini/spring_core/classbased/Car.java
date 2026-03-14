package com.capgemini.spring_core.classbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value("001")
	private int carId;
	@Value("Maruti Swift")
	private String carName;
	@Value("Blue")
	private String colour;
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", colour=" + colour + "]";
	}
	
}
