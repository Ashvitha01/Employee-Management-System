package in.ashvi.service;

import java.util.List;

import in.ashvi.entity.Employee;

public interface IEmployeeService {
  public Employee saveEmployee(Employee employee);
  public List <Employee> getAllEmployee();
  public Employee getEmployeeByid(int id);
  public Employee updateEmployeeByid(Employee employee, int id);
  public String deleteEmployeeByid(int id);
}
