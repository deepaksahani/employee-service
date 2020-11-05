package com.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Emp_TB")
public class Employee 
{
    @Id
	private int employeeID;
    @Column
	private String employeeName;
    @Column
    private String title;
    @Column
	private String businessUnit;
    @Column
	private String place;
    @Column
	private String supervisorId;
    @Column
    private String competencies;
    @Column
	private double salary;
    
    public Employee() 
    {
    	
    }
	
	public Employee(int employeeID, String employeeName, String title, String businessUnit, String place,
			String supervisorId, String competencies, double salary) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.title = title;
		this.businessUnit = businessUnit;
		this.place = place;
		this.supervisorId = supervisorId;
		this.competencies = competencies;
		this.salary = salary;
	}

	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	public String getCompetencies() {
		return competencies;
	}
	public void setCompetencies(String competencies) {
		this.competencies = competencies;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
    

}
