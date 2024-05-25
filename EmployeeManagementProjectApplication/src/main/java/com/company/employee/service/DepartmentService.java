package com.company.employee.service;

import java.util.List;
import java.util.Optional;

//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.data.domain.Page;

import com.company.employee.model.Department;

public interface DepartmentService {

	public Department createDepartment(Department department);

	Optional<Department> updateDepartment(Long id, Department departmentDetails);

	boolean deleteDepartment(Long id);

//	List<Department> getAllDepartments(Pageable pageable);



//	public Page<Department> findAll(org.springframework.data.domain.Pageable pageable);

//	List<Department> getAllDepartments(Long id);

	List<Department> getAllDepartments();

	Optional<Department> getDepartment(Long id);
	
}
