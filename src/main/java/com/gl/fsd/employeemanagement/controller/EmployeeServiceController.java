package com.gl.fsd.employeemanagement.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.fsd.employeemanagement.entity.Employee;
import com.gl.fsd.employeemanagement.entity.Role;
import com.gl.fsd.employeemanagement.entity.User;
import com.gl.fsd.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeServiceController {

	@Autowired
	EmployeeService employeeService;

	public EmployeeServiceController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}

	@PostMapping("/user")
	public User saveUser(@RequestBody User theUser) {
		return employeeService.saveUser(theUser);
	}

	@PostMapping("/role")
	public Role saveRole(@RequestBody Role theRole) {
		return employeeService.saveRole(theRole);
	}
	

	@GetMapping("/employees")
	public List<Employee> findAllEmployees() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> currentPrincipalName = authentication.getAuthorities();
		System.out.println(currentPrincipalName);
		return employeeService.findAllEmployees();
	}

    @GetMapping("/employees/{theId}")
	public Employee getEmployee(@PathVariable int theId) {
		Employee theEmployee = employeeService.findById(theId);
		if (theEmployee == null) {
			throw new RuntimeException("Employee id not found - " + theId);
		}
		return theEmployee;
	}

	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@PutMapping("/updateEmployees/{id}")
	public Employee updateEmployee(@RequestBody Employee theEmployee, @PathVariable int id) {
		Employee tempEmployee = employeeService.findById(id);

		if (tempEmployee == null) {
			throw new RuntimeException("Employee with id " + id + " not found");
		}
		tempEmployee.setFirstName(theEmployee.getFirstName());
		tempEmployee.setLastName(theEmployee.getLastName());
		tempEmployee.setEmail(theEmployee.getEmail());
		employeeService.save(theEmployee);
		theEmployee.setId(id);
		return theEmployee;
	}

	@DeleteMapping("/employees/{theId}")
	public String deleteById(@PathVariable int theId) {
		return employeeService.deleteById(theId);
	}

	@GetMapping("/searchBy")
	public List<Employee> searchBy(@RequestParam("firstName") String firstName) {
		return employeeService.searchBy(firstName);
	}


	@GetMapping("/sort/{direction}")
	public List<Employee> getEmployeesCustomSortedByName(@PathVariable Direction direction) {
		return employeeService.getEmployeesCustomSortedByName(direction);
	}

}
