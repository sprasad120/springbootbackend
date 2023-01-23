package com.asus.springbootbackend;

import com.asus.springbootbackend.model.Employee;
import com.asus.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Sai Prasad");
//		employee.setLastName("Surampudi");
//		employee.setEmailId("saiprasadsurampudi@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Devashri");
//		employee1.setLastName("Gaikwad");
//		employee1.setEmailId("devashri.gaikwad@outlook.com");
//		employeeRepository.save(employee1);
//	}
}
