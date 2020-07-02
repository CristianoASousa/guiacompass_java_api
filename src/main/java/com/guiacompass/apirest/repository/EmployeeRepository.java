package com.guiacompass.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiacompass.apirest.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee findById(long id_employee);
	
}