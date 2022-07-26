package abhi.sboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import abhi.sboot.model.Employee;
import abhi.sboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository eRepository;

	private List<Employee> list = new ArrayList<>();

	@Override
	public List<Employee> fetchEmployees() {
		list = eRepository.findAll();
		return list;

//		return eRepository.findAll();
	}

	public Employee fetchSingleEmployee(Long id) {

		Optional<Employee> employee = eRepository.findById(id);

		if (employee.isPresent()) {
			return employee.get();
		} else {
			throw new RuntimeException("Employee id is not found in DB-Tab : " + id);
		}
	}

	@Override
	public Employee saveSingleEmployee(Employee employee) {

		Employee save = eRepository.save(employee);
		return save;
	}

//	@Override
//	public Employee saveEmployees(Employee employee) {
//		
//		Employee save = (Employee) eRepository.save(employee);	
//		return save;
//	}

	@Override
	public Employee updateSingleEmployee(Employee employee) {

		Employee save = (Employee) eRepository.save(employee);
		return save;
	}

	@Override
	public void deleteSingleEmployee(Long id) {
	eRepository.deleteById(id);
    }
}


	
/*

public HttpStatus deleteSingleEmployee(Long id) {	
	eRepository.deleteById(id);
	return null;
}

 */

