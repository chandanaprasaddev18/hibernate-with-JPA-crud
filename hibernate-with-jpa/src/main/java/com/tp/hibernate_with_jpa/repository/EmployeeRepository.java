package com.tp.hibernate_with_jpa.repository;

import com.tp.hibernate_with_jpa.entity.Employee;

public interface EmployeeRepository {
	public Integer saveEmployee(Employee employee);
}
