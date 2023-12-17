package com.oaed.employee.employes.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@Column(name="stud_Id")
private String studId;
@Column(name="name")
private String name;
@Column(name="department")
private String department;

public Employee() {
	
}

public Employee(String studId, String name, String department) {
	super();
	this.studId = studId;
	this.name = name;
	this.department = department;
}

public String getStudId() {
	return studId;
}

public void setStudId(String studId) {
	this.studId = studId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [studId=" + studId + ", name=" + name + ", department=" + department + "]";
}



}
