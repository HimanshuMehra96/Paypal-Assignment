package com.paypal.bfs.test.employeeserv.impl;

import com.paypal.bfs.test.employeeserv.api.EmployeeResource;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

/**
 * Implementation class for employee resource.
 */
@Validated
@RestController
public class EmployeeResourceImpl implements EmployeeResource {

    @Autowired
	private EmployeeService service;
    
	@Override
    public ResponseEntity<Employee> employeeGetById(Integer id) {
		return service.employeeGetById(id);
    }
	
	@Override
	public ResponseEntity<String> addEmployee(Employee employee) {
		return service.addEmployee(employee);
	}
}
