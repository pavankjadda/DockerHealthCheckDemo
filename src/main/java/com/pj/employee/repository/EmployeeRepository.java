package com.pj.employee.repository;

import com.pj.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Pavan Jadda
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>
{
}
