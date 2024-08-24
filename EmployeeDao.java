package com.nit.dao;

import java.util.List;

import com.nit.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	Employee getEmployee(Long id);
	void saveEmployee(Employee emp);
	void updateEmployee(Employee emp);
	void deleteEmployee(Long id);
}
