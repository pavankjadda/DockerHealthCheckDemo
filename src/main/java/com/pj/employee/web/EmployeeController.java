package com.pj.employee.web;

import com.pj.employee.domain.Employee;
import com.pj.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Pavan Jadda
 */
@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController
{
	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}


	@GetMapping("/find/all")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
}
