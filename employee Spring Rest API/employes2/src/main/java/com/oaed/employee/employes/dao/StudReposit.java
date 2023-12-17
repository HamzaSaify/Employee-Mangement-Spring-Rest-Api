package com.oaed.employee.employes.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.oaed.employee.employes.entity.Employee;

@RepositoryRestResource(path="members")
public interface StudReposit extends JpaRepository<Employee,String> {

}
