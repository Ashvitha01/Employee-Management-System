package in.ashvi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashvi.entity.Employee;
import in.ashvi.repository.EmployeeRepository;

@Component
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeRepository employeerepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		System.out.println("Entered into Employeeservice"+employee);
		Employee savedEmployee = employeerepository.save(employee);
		return savedEmployee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> getalldata = employeerepository.findAll();
		
		return getalldata;
	}

	@Override
	public Employee getEmployeeByid(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> findbyid = employeerepository.findById(id); 
		return findbyid.get() ; // get()==> used to fetch the data from the db
	}

	@Override
	public Employee updateEmployeeByid(Employee employee, int id) {
		// TODO Auto-generated method stub
		Employee findbyidupdate = employeerepository.findById(id).get();
		
		if(findbyidupdate!=null) {
			findbyidupdate.setId(id);
			findbyidupdate.setEmployeeName(employee.getEmployeeName());
			findbyidupdate.setAddress(employee.getAddress());
			findbyidupdate.setDesignation(employee.getDesignation());
			findbyidupdate.setPhone(employee.getPhone());
			findbyidupdate.setSalary(employee.getSalary());
			Employee update = employeerepository.save(findbyidupdate);
			
			return update;
		}
		
		return null;
	}

	@Override
	public String deleteEmployeeByid(int id) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(id);
		
		return "Successfully deleted";
	}

	
}
