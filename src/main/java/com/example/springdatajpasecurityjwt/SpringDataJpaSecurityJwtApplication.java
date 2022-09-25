package com.example.springdatajpasecurityjwt;

import com.example.springdatajpasecurityjwt.entity.Employee;
import com.example.springdatajpasecurityjwt.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaSecurityJwtApplication {
//	@Autowired
//	EmployeeRepository repository;
//	private void insertEmployee(EmployeeRepository repository){
//		Employee employee = Employee.builder().firstName("Dao").lastName("Cao Thang").email("Thang@gmail.com").build();
//		repository.save(employee);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaSecurityJwtApplication.class, args);
	}

}
