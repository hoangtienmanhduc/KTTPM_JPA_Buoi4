package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaSecurityJwtApplication {
//	@Autowired
//	EmployeeRepository repository;
//	private void insertEmployee(EmployeeRepository repository){
//		Employee employee = Employee.builder().firstName("Hoang Tien").lastName("Manh Duc").email("Duc@gmail.com").build();
//		repository.save(employee);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaSecurityJwtApplication.class, args);
	}

}
