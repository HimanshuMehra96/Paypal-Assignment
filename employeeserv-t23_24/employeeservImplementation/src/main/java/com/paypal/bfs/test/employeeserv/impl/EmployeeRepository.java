package com.paypal.bfs.test.employeeserv.impl;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer>{
}
