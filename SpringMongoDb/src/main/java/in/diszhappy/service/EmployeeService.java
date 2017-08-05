/**
 * 
 */
package in.diszhappy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.diszhappy.document.Employee;
import in.diszhappy.repo.EmployeeRepository;

/**
 * @author Saumm
 * Created on 30-Jul-2017 1:36:16 AM
 */
@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository  employeeRepository;
	/**
	 * 
	 * This method is written by Saumm on 30-Jul-2017 1:40:25 AM
	 * Desc : This method will
	 * @return
	 */
	public List<Employee> findAllEmployee(){
		return employeeRepository.findAll();
	}
	
	public Employee updateEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
	public Employee addNewEmployee(Employee employee){
		return employeeRepository.save(employee);
	}
	public void deleteEmployee(Employee entity){
		employeeRepository.delete(entity);
	}

	public void deleteEmployee(String id) {
		employeeRepository.delete(id);
	}

}
