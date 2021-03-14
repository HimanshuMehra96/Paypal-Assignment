package com.paypal.bfs.test.employeeserv.impl;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.paypal.bfs.test.employeeserv.api.model.Employee;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String addressLine1;
    private String addressLine2;
    private String addressCity;
    private String addressCountry;
    private Integer addressZipCode;
    
	public Integer getId() {
		return id;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(Employee employee) {
		super();
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.dateOfBirth = employee.getDateOfBirth();
		this.addressLine1 = employee.getAddress().getLine1();
		this.addressLine2 = employee.getAddress().getLine2();
		this.addressCity = employee.getAddress().getCity();
		this.addressCountry = employee.getAddress().getCountry();
		this.addressZipCode = employee.getAddress().getZipCode();
	}
	public EmployeeEntity(Integer id, String firstName, String lastName, Date dateOfBirth, String addressLine1,
			String addressLine2, String addressCity, String addressCountry, Integer addressZipCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressCity = addressCity;
		this.addressCountry = addressCountry;
		this.addressZipCode = addressZipCode;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getAddressCity() {
		return addressCity;
	}
	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}
	public String getAddressCountry() {
		return addressCountry;
	}
	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}
	public Integer getAddressZipCode() {
		return addressZipCode;
	}
	public void setAddressZipCode(Integer addressZipCode) {
		this.addressZipCode = addressZipCode;
	}
}
