package com.company.employee.serviceimplementation;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.employee.model.Employee;
import com.company.employee.repository.EmployeeRepo;
import com.company.employee.service.EmployeeService;

@Service
public class EmployeeServiceImplmnt implements EmployeeService {
	
	@Autowired
    private EmployeeRepo employeeRepository;

	@Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

	@Override
    public Optional<Employee> updateEmployee(Long id, Employee employeeDetails) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(employeeDetails.getName());
            employee.setDateOfBirth(employeeDetails.getDateOfBirth());
            employee.setSalary(employeeDetails.getSalary());
            employee.setAddress(employeeDetails.getAddress());
            employee.setRole(employeeDetails.getRole());
            employee.setJoiningDate(employeeDetails.getJoiningDate());
            employee.setYearlyBonusPercentage(employeeDetails.getYearlyBonusPercentage());
            employee.setDepartment(employeeDetails.getDepartment());
            employee.setReportingManager(employeeDetails.getReportingManager());
            return employeeRepository.save(employee);
        });
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

	
}
