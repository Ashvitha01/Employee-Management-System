package in.ashvi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashvi.entity.Employee;
import in.ashvi.service.IEmployeeService;

@RestController  // this creates  the rest application, this annotation is used to receive the request from the front end
public class EmployeeController {
	
   @Autowired
	IEmployeeService  iemployeeservice;
	
	@PostMapping("/Create")   //  this annotation is used to insert the data into db
	public Employee saveEmployee(@RequestBody Employee employee) {
		System.out.println("Entered into EmployeeController" + employee);
		Employee saveEmployee = iemployeeservice.saveEmployee(employee);
		return saveEmployee;
	}
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployee(){
		
		List<Employee> getallEmployee = iemployeeservice.getAllEmployee();
		System.out.println("Get all employee");
		return getallEmployee;
		
	}
	
	@GetMapping("/getbyid/{id}")
	public Employee getEmployeeByid(@PathVariable("id") int id) {
		
   	System.out.println("Entered into getEmployeeByid "+ id );
		Employee employeeByid = iemployeeservice.getEmployeeByid(id);
		
		return employeeByid;
		
	}
	
	
	@PutMapping("/updateEmployeeByid/{id}")
	public Employee updateEmployeeByid(@RequestBody Employee employee,@PathVariable("id") int id) {
		System.out.println("Entered into updateemployeebyid"+id);
		Employee updateById = iemployeeservice.updateEmployeeByid(employee, id);
		
		return updateById;
		
	}
	
	@DeleteMapping("/deleteEmployeeByid/{id}")
	public String deleteEmployeeByid(@PathVariable("id") int id) {
		
		String deleteemployee = iemployeeservice.deleteEmployeeByid(id);
		return "Delete employee";
		
	}
}
