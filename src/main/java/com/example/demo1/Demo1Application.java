package com.example.demo1;

import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

// Use this when not using a database:
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

// Enable CORS using the following code: 
// origins is the URL of the client application that is allowed to access the resources from the server.
// 3600 seconds is the maximum amount of time that the preflight request is cached.
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@SpringBootApplication()
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}

// Basic things in a spring project:
// 1. Controller file : This file is used to handle the incoming requests and send the response back to the client.
// 2. Service file : This file is used to write the business logic.
// 3. Repository file : This file is used to interact with the database.
// 4. Model file : This file is used to create the model class.
// 5. Application file : This file is used to run the spring boot application.
// 6. Entity file : This file is used to create the entity class.

// =============== Above are the basic things in a spring project ===============
// 7. Configuration file : This file is used to configure the application.
// 8. Exception file : This file is used to handle the exceptions.
// 9. Security file : This file is used to handle the security.
// 10. Filter file : This file is used to handle the filters.
// 11. Interceptor file : This file is used to handle the interceptors.
// 12. DTO file : This file is used to create the data transfer object.
// 13. Util file : This file is used to create the utility classes.
// 14. Constants file : This file is used to create the constants.

