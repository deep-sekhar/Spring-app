package com.example.demo1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//This is the template for the repository file. This file is used to interact with the database.
@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
    
}
