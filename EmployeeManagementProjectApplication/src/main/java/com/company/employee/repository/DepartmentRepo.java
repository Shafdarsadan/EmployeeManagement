package com.company.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.employee.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, Long> {

}
