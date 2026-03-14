package com.capgemini.spring_core.classbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Value("1223") 
	private int bikeId;
	@Value("Honda CB350RS")
	private String bikeName;
	@Value("Red")
	private String colour;
	@Override
	public String toString() {
		return "Bike [bikeId=" + bikeId + ", bikeName=" + bikeName + ", colour=" + colour + "]";
	}
	

}
