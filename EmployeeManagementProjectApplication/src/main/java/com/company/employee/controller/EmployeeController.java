package com.company.employee.controller;

//import java.util.List;
import java.util.Optional;

//import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.employee.model.Employee;
//import com.company.employee.service.EmployeeService;
import com.company.employee.serviceimplementation.EmployeeServiceImplmnt;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	 @Autowired
	    private EmployeeServiceImplmnt employeeService;

	    @PostMapping("/post")
	    public Employee createEmployee(@RequestBody Employee employee) {
	        return employeeService.createEmployee(employee);
	    }

	    @PutMapping("/{id}")
	    public Optional<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
	        return employeeService.updateEmployee(id, employeeDetails);
	    }

//	    @GetMapping
//	    public Page<Employee> getAllEmployees(@RequestBody(defaultValue = "0") int page) {
//	        Pageable pageable = PageRequest.of(page, 20);
//	        return employeeService.getAllEmployees(pageable);
//	    }
}
