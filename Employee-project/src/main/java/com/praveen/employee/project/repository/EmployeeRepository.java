package com.praveen.employee.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praveen.employee.project.model.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
