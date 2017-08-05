/**
 * 
 */
package in.diszhappy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.diszhappy.document.Employee;
import in.diszhappy.service.EmployeeService;

/**
 * 
 * @author Saumm
 * Created on 30-Jul-2017 1:41:59 AM
 */
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	/**
	 * 
	 * This method is written by Saumm on 30-Jul-2017 1:42:06 AM
	 * Desc : This method will
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/findAll")
	public List<Employee> findAll() {
		return service.findAllEmployee();

	}
	@RequestMapping(method=RequestMethod.PUT,value="/update")
	public Employee updateEmployee(@RequestBody Employee employee){
		return service.updateEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.POST,value="/add")
	public Employee addNewEmployee(@RequestBody Employee employee){
		return service.addNewEmployee(employee);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/delete")
	public void deleteEmployee(@RequestBody Employee entity){
		service.deleteEmployee(entity);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/delete/{id}")
	public void deleteEmployee(@PathVariable String id){
		service.deleteEmployee(id);
	}

}
