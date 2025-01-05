package in.ashvi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashvi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
