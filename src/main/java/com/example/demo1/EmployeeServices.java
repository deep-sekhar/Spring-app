package com.example.demo1;

import java.util.List;

//This is the template for the service file. This file is used to write the business logic.
public interface EmployeeServices {
    String createEmployee(Employee employee);
    List<Employee> getEmployees();
    boolean deleteEmployee(Long id);
    String updateEmployee(Long id, Employee employee);
}
