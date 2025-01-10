package com.tp.hibernate_with_jpa.repositoryImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tp.hibernate_with_jpa.entity.Employee;
import com.tp.hibernate_with_jpa.repository.EmployeeRepository;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mysql");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Integer saveEmployee(Employee employee) {

		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(employee);
		transaction.commit();
		return employee.getId();
	}

}
