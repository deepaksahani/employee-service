package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;


@Service
public class EmployeeService 
{
@Autowired
private EmployeeRepository emprepo;

private static List<Employee> list=new ArrayList<>();


public Employee saveemployee(Employee employee) 
{
return emprepo.save(employee);
}

public void updatesalary(Employee employee,String place)
{
	list=list.stream().map(b->{
		if(b.getPlace()==place) 
		{
			b.setSalary(3000);
		}
			return b;
	}).collect(Collectors.toList());
	
}

//pagination
public Page<Employee> getPaginatedUser()
{
	  PageRequest pageable=PageRequest.of(0, 5);
	  return emprepo.findAll(pageable);
}

public List<Employee> getsalary()
{
return emprepo.findBySalary();	
}
}
