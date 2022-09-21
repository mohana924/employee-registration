package com.employeeproject;

import java.util.List;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(Long id);
	
	public void saveEmployee(Employee employee);
	
	public void deleteEmployeeById(long id);

}
