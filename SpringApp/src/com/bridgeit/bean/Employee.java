package com.bridgeit.bean;

public class Employee {

	private String employeeName;
	private int employeeID;
	private float employeeSalary;
	private String employeeDesignation;
	private String Address;
	private int contact;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Employee [Employee Name=" + employeeName + ", Employee ID=" + employeeID + ", Employee Salary="
				+ employeeSalary + ", Employee Designation=" + employeeDesignation + ", Address=" + Address
				+ ", contact=" + contact + "]";
	}
	
	
	
}
