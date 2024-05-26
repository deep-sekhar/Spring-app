package com.example.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServicesImpl implements EmployeeServices{

    @Autowired
    private EmployeeRepository employeeRepository;

    List<Employee> employees = new ArrayList<Employee>();

    @Override
    public String createEmployee(Employee employee) {
        try{
            EmployeeEntity employeeEntity = new EmployeeEntity();
            BeanUtils.copyProperties(employee, employeeEntity);
            employeeRepository.save(employeeEntity);
            return "Employee created successfully";
        }catch(Exception e){
            return "Employee creation failed";
        }
    }

    @Override
    public List<Employee> getEmployees() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<Employee>();
        for(EmployeeEntity employeeEntity : employeeEntities){
            Employee employee = new Employee();
            // only send required data
            employee.setPhone(employeeEntity.getPhone());
            employee.setName(employeeEntity.getName());
            employees.add(employee);
        }
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        if(employeeEntity != null){
            employeeRepository.delete(employeeEntity);
            return true;
        }
        return false;
    }
    
    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        if(employeeEntity != null){
            employeeEntity.setName(employee.getName());
            employeeEntity.setEmail(employee.getEmail());
            employeeEntity.setPhone(employee.getPhone());
            employeeRepository.save(employeeEntity);
            return "Employee updated successfully";
        }
        return "Employee not found";
    }
}
