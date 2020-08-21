package com.pj.employee.service;

import com.pj.employee.domain.Employee;
import com.pj.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Pavan Jadda
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService
{
	private final EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository)
	{
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> findAll()
	{
		return employeeRepository.findAll();
	}
}
