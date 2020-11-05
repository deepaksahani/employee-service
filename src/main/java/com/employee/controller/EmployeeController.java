package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;



@RestController
public class EmployeeController 
{

	@Autowired
	private EmployeeService employeeservice;
	
@PostMapping("/saveemployee")
public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee)
{
 	Employee saveemployee = employeeservice.saveemployee(employee);
try {
		
		return new ResponseEntity<>(saveemployee, HttpStatus.OK);
	   }
	catch(Exception e)
	{
		e.printStackTrace();
		return new ResponseEntity<>(saveemployee, HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
}

@PutMapping("/updatesalary/{place}")
public ResponseEntity<Employee> updatesalary(@RequestBody Employee employee, @PathVariable("place") String place)
{
	this.employeeservice.updatesalary(employee, place);

	//return employee;
	try {
		return new ResponseEntity<>(employee,HttpStatus.OK);
		}

	catch(Exception e) 
	    {
		e.printStackTrace();
		 return new ResponseEntity<>(employee,HttpStatus.NO_CONTENT);
	    }

}

@GetMapping("/getpaginateddata")
public Page<Employee> getpaginatedRecords()
{	
return employeeservice.getPaginatedUser();

}

@GetMapping("/getrangeofsalary")
public ResponseEntity<List<Employee>> getrangeofsalary()
{
 List<Employee> getsalary = employeeservice.getsalary();	
try {
	return new ResponseEntity<>(getsalary,HttpStatus.OK);
	}

catch(Exception e) 
    {
	e.printStackTrace();
	 return new ResponseEntity<>(getsalary,HttpStatus.NO_CONTENT);
    }
}

}

