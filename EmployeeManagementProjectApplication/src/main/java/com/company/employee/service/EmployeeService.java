package com.company.employee.service;

import java.util.Optional;

import com.company.employee.model.Employee;

public interface EmployeeService {

//	Employee createEmployee(Employee employee);
//
//	Optional<Employee> updateEmployee(Long id, Employee employeeDetails);

	Employee createEmployee(Employee employee);

	Optional<Employee> updateEmployee(Long id, Employee employeeDetails);

 
	
	
}
