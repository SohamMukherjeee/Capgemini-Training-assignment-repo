package com.capgemini.spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-config.xml");
//		User user = (User) applicationContext.getBean("user");
//		System.out.println(user);

//		Employee employee = (Employee) applicationContext.getBean("emp");
//		System.out.println(employee);

		PojoClass pojoClass = (PojoClass) applicationContext.getBean("pojo",PojoClass.class);
		System.out.println(pojoClass);
	}
}
