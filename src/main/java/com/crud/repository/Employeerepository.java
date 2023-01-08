package com.crud.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Employee;
//CrudRepository<T, ID> {parameter Entity or model and datatype of primary key}this interface include many method like findall and finabyid and update
@Repository
public interface Employeerepository extends CrudRepository<Employee, Integer>{
	//to add addtional method custom method
	List<Employee>findByName(String name);
	
	List<Employee>findBySalary(long salary);
	

}
