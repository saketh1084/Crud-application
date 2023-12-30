package com.st.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.st.Pojo.Employee;
import com.st.Repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	public Employee save(Employee emp) {
		return employeeRepo.save(emp);
	}
	
	public Employee getEmployee(int id) {
		return employeeRepo.findById(id).get();
	}
	
	public Employee update(Employee employee){
		Employee emp =employeeRepo.findById(employee.getId()).get();
		emp.setFirst_name(employee.getFirst_name());
		emp.setLast_name(employee.getLast_name());
		
		return employeeRepo.save(emp);
	}

	public String delete(int id) {
		employeeRepo.deleteById(id);
		return "Entity deleted" +id;
	}
	public EmployeeRepo getEmployeeRepo() {
		return employeeRepo;
	}

	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	
	
	
}
