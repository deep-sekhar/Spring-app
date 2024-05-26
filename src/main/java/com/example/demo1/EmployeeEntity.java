package com.example.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// lombok data annotation is used to generate the getters, setters, constructors, and toString method.

@Data
@Entity
@Table(name = "employee_db")
public class EmployeeEntity {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String phone;
}
