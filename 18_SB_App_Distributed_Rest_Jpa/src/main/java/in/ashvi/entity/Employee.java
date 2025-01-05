package in.ashvi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Table;

@Entity  // used to create the table names as class name Employee in the database which is mentioned in application.properties
//@Table(name="employee_18")  // it is optional if we want to add a another table means we use this annotation
public class Employee {
	
 @Id //	
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
 private String employeeName;
 private String designation;
 private String address;
 private Double salary;
 private Long phone;
 
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
public Long getPhone() {
	return phone;
}
public void setPhone(Long phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", employeeName=" + employeeName + ", designation=" + designation + ", address="
			+ address + ", salary=" + salary + ", phone=" + phone + ", getId()=" + getId() + ", getEmployeeName()="
			+ getEmployeeName() + ", getDesignation()=" + getDesignation() + ", getAddress()=" + getAddress()
			+ ", getSalary()=" + getSalary() + ", getPhone()=" + getPhone() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
	
}
