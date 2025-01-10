package com.tp.hibernate_with_jpa;

import com.tp.hibernate_with_jpa.entity.Employee;
import com.tp.hibernate_with_jpa.repository.EmployeeRepository;
import com.tp.hibernate_with_jpa.repositoryImpl.EmployeeRepositoryImpl;

public class SaveEmployee {
	public static void main(String[] args) {
		EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

		Employee employee = new Employee().builder().city("Bengaluru").empName("Virat").salary(889845d).build();

		Integer saveEmployee = employeeRepository.saveEmployee(employee);
		System.out.println("The id of the saved employee is " + saveEmployee);
	}
}
