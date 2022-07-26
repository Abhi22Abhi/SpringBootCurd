package abhi.sboot.service;

import java.util.List;

import abhi.sboot.model.Employee;

public interface EmployeeService {

	//Retrieve
	List<Employee> fetchEmployees();
	public Employee fetchSingleEmployee(Long id);
	
	
	//Create
	Employee saveSingleEmployee(Employee employee);
	//Employee saveEmployees(Employee employee);

	
	//Update
	Employee updateSingleEmployee(Employee employee);
//  Employee updateEmployees(Employee employee);

	
	//Delete
	void deleteSingleEmployee(Long id);
//	HttpStatus deleteSingleEmployee(Long id);
	
	
}
