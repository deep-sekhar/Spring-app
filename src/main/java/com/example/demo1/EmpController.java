package com.example.demo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



// This is the controller file. This file is used to handle the incoming requests and send the response back to the client.
@RestController
public class EmpController {
    
    @Autowired
    EmployeeServices employeeServices;
    EmpController(EmployeeServices employeeServices){
        this.employeeServices = employeeServices;
    }

    // This is the method to create the employee.
    @PostMapping("create")
    public String createEmp(@RequestBody Employee employee){ 
        return employeeServices.createEmployee(employee);
    }

    // This is the method to get the employees.
    @GetMapping("get")
    public List<Employee> getMethodName() {
        return employeeServices.getEmployees();
    }

    // This is the method to delete the employee.
    @DeleteMapping("del/{id}")
    public String deleteEmp(@PathVariable Long id){
        if(employeeServices.deleteEmployee(id)){
            return "Employee deleted successfully";
        }else return "Employee not found";
    }    
    

    @PutMapping("update/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody Employee employee) {
        return employeeServices.updateEmployee(Long.parseLong(id), employee);
    }
}
