package com.capgemini.spring_core.classbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
     ApplicationContext applicationContext= new AnnotationConfigApplicationContext(BeanConfig.class);
     Bike bike = applicationContext.getBean(Bike.class);
     Car car = applicationContext.getBean(Car.class);
     //System.out.println(bike);
    // System.out.println(car);
     Pojo pojo = applicationContext.getBean(Pojo.class);
     System.out.println(pojo);
	}

}
