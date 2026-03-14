package com.capgemini.mangSystem.EmployeeManagement;

public class EmployeeServiceImpl implements EmployeeService {

    private Employee employee;

    public EmployeeServiceImpl() {
        super();
    }

    public Employee getEmployeeObj() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void addEmployee() {
        System.out.println("Employee added");
    }

    @Override
    public void updateEmployee() {
        System.out.println("Employee updated");
    }

    @Override
    public void deleteEmployee() {
        System.out.println("Employee deleted");
        System.out.println("Employee ID: " + employee.getId());
    }

    @Override
    public void getEmployee() {
        displayEmployee();
    }

    private void displayEmployee() {
        if (employee == null) {
            System.out.println("Employee details not available");
            return;
        }

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        Address address = employee.getAddress();
        if (address != null) {
            System.out.println("City: " + address.getCity());
            System.out.println("State: " + address.getState());
            System.out.println("Country: " + address.getCountry());
            System.out.println("Pincode: " + address.getPincode());
        }
    }
}
