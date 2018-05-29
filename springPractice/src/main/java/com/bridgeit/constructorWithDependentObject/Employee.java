package com.bridgeit.constructorWithDependentObject;

public class Employee {
private int id;
private String name;
private float Salary;
AddressPojo address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getSalary() {
	return Salary;
}
public void setSalary(float salary) {
	Salary = salary;
}
public AddressPojo getAddress() {
	return address;
}
public void setAddress(AddressPojo address) {
	this.address = address;
}
public Employee(int id, String name, float salary, AddressPojo address) {
	super();
	this.id = id;
	this.name = name;
	Salary = salary;
	this.address = address;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", address=" + address.toString() + "]";
}



}
