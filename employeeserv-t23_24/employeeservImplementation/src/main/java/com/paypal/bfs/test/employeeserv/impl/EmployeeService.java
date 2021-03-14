package com.paypal.bfs.test.employeeserv.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public Employee EmployeeEntityToEmployee(EmployeeEntity employeeEntity) {
		Employee employee = new Employee();
		Address address = new Address();
		address.setLine1(employeeEntity.getAddressLine1());
		address.setLine2(employeeEntity.getAddressLine2());
		address.setCity(employeeEntity.getAddressCity());
		address.setCountry(employeeEntity.getAddressCountry());
		address.setZipCode(employeeEntity.getAddressZipCode());
        employee.setId(employeeEntity.getId());
        employee.setFirstName(employeeEntity.getFirstName());
        employee.setLastName(employeeEntity.getLastName());
        employee.setAddress(address);
        employee.setDateOfBirth(employeeEntity.getDateOfBirth());
        return employee;
	}
	
	public ResponseEntity<Employee> employeeGetById(Integer id) {
		Employee employee = new Employee();
		EmployeeEntity employeeEntity = repository.findById(id).get();
		employee = EmployeeEntityToEmployee(employeeEntity);
		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	
	public ResponseEntity<String> addEmployee(Employee employee) {
		EmployeeEntity employeeEntity = new EmployeeEntity(employee);
		EmployeeEntity e = repository.save(employeeEntity);
		String response =
		  "Employee information Succesfully saved. Your employee id is: "+e.getId();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
