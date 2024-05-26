package com.example.demo1;

// using lombok to generate the getters and setters and constructors.
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// This is the model class. This class is used to create the model for the employee.
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    // These are the fields of the employee model.
    private @Getter @Setter Long id;
    private @Getter @Setter String name;
    private @Getter @Setter String email;
    private @Getter @Setter String phone;
}
