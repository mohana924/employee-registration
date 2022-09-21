package com.employeeproject;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@GetMapping("/employee/delete/{id}")
	public void deleteEmployee(@PathVariable(value="id") long id) {
		this.employeeService.deleteEmployeeById(id);
	}
	
	@PostMapping("/employee/save")
	public void saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
	}
}
