package com.employee.mgmt.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.mgmt.model.Employee;
import com.employee.mgmt.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	private EmployeeRepository employeeRepository;

	// By using a constructor and the `@RestController` annotation above, you can autowire the class in like this
	// That allows you to write tests easier
	public EmployeeController(EmployeeRepository employeeRepository) {
	this.employeeRepository = employeeRepository;
	}
	//get all employee
	// I suggest doing all lowercase endpoints
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}

}

