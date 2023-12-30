package com.st.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.st.Pojo.Employee;
import com.st.Service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping
	public Employee addEmployee(@RequestBody Employee employee ) {
		return employeeService.save(employee);
	}
	
	@GetMapping(path = "/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return employeeService.getEmployee(id);
		}
	@PutMapping()
	public Employee updateEmployee(@RequestBody Employee employee ) {
		return employeeService.update(employee);
	}
	@DeleteMapping(path ="/{id}")
	public String deleteEmployee(@PathVariable int id) {
	return  employeeService.delete(id);
	
	}
	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	}


