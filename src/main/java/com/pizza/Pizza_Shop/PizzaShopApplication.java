package com.pizza.Pizza_Shop;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
<<<<<<< HEAD
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pizza.Pizza_Shop.controller.Employee.Employee;
=======
>>>>>>> da210afdf375b5de214ed0560080119d7637ff72

@SpringBootApplication
@RestController

public class PizzaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaShopApplication.class, args);
		try {
			Connection connection = DriverManager.getConnection(
					"jdbc:snowflake://UMB53692.us-east-1.snowflakecomputing.com/?warehouse=COMPUTE_WH&db=JSON_UBER_EATS&role=ACCOUNTADMIN&schema=PUBLIC&user=shriyugaglani&password=Sajish@2023");
			System.out.println("Connected");
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public List<Employee> db = List.of(new Employee("1", "1232312", "143243242"));

	@GetMapping("/")
	public String hello(){
		return "HI";
	}


	@GetMapping("/employees")
	public List<Employee> home(){
		return db;
	

	}

	
}