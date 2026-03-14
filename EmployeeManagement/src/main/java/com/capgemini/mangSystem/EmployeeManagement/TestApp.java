package com.capgemini.mangSystem.EmployeeManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeService employeeService = (EmployeeService) context.getBean("employeeService");
        employeeService.addEmployee();
        employeeService.updateEmployee();
        employeeService.getEmployee();
        employeeService.deleteEmployee();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
