package com.gl.fsd.employeemanagement.service;

import java.util.List;

import org.springframework.data.domain.Sort.Direction;

import com.gl.fsd.employeemanagement.entity.Employee;
import com.gl.fsd.employeemanagement.entity.Role;
import com.gl.fsd.employeemanagement.entity.User;

public interface EmployeeService {

		List<Employee> findAllEmployees();

		Employee findById(int id);

		String addEmployee(Employee theEmployee);

		String deleteById(int theId);

		String save(Employee theEmployee);
	
		List<Employee> searchBy(String firstName);

		List<Employee> getEmployeesCustomSortedByName(Direction direction);

		User saveUser(User theuser);

		Role saveRole(Role theRole);

		
	



}
