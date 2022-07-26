package abhi.sboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import abhi.sboot.model.Employee;
import abhi.sboot.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl eService;
	
	@GetMapping("/employee")
	public List<Employee> retrieveEmployees()  
	{ 
		return eService.fetchEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee retrieveSingleEmployee(@PathVariable Long id)  
	{ 
		return eService.fetchSingleEmployee(id);
	}

	
	@PostMapping("/employee")
	public Employee CreateSingleEmployee(@RequestBody  Employee employee)  
	{ 
		return eService.saveSingleEmployee(employee);
	}
	
//	
//	@PostMapping("/employees")
//	public List<Employee> CreateEmployees(@RequestBody  Employee employee)  
//	{ 
//		return (List<Employee>) eService.saveEmployees(employee);
//	}
//	
	
	
	@PutMapping("/employee/{id}")
	public Employee modifySingleEmployee(@RequestBody Employee employee,@RequestBody @PathVariable Long id)  
	{ 
		employee.setId(id);
		return eService.updateSingleEmployee(employee);
	}
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmpPoint(@PathVariable Long id)  
	{ 
		eService.deleteSingleEmployee(id);
		return "Record is deleted from DB : "+id;
	}

}


//  http://localhost:1234/abhi/employee
//  http://localhost:1234/abhi/employee/12