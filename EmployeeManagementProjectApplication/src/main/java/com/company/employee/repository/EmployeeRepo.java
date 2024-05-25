package com.company.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.employee.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
