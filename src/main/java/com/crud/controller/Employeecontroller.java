package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Employee;
import com.crud.repository.Employeerepository;

@RestController
public class Employeecontroller {
	
	
	@Autowired
	private Employeerepository employeerepository;
	
	@GetMapping("/employee/count")
	public long count() {
		return employeerepository.count();
	}

	@GetMapping("/employee/{id}")
	public Employee finById(@PathVariable Integer id ) {
		return employeerepository.findById(id).get();
	}
	@GetMapping("/employee/all")
	public Iterable<Employee> finAll(){
		return  employeerepository.findAll();
	}
	//insert id auto so pass argument =0 by using save method
	@GetMapping("/employee/insert")
	public Employee add() {
		return employeerepository.save(new Employee(0, "malek", 8526));
	}
	//to update use method svae in 3 para id ,name,salary there pass para id to update value of colum it
		@GetMapping("/employee/update")
		public Employee update() {
			return employeerepository.save(new Employee(3, "malek", 8526));
		}
		@GetMapping("/filtername/{name}")
	public List<Employee>findByName(@PathVariable String name){
		return employeerepository.findByName(name);
	}
	
	 @GetMapping("/filtersalary/{salary}")
	public List<Employee>findBySalary(@PathVariable Long salary){
		return employeerepository.findBySalary(salary);
		}
	
	
	
	
	
	
}
