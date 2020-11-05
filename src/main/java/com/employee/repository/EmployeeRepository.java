package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
//@Modifying
//@Query("UPDATE Employee SET salary=salary*0.50")
//public List<Employee> findByUpdateEmployee();


@Query("select e from Employee e where salary between 2500 and 4000")
public List<Employee> findBySalary();
}
