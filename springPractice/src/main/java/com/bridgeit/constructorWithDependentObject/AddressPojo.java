package com.bridgeit.constructorWithDependentObject;

public class AddressPojo {
private String state;
private String city;
private String country;

public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "AddressPojo [state=" + state + ", city=" + city + ", country=" + country + "]";
}
public AddressPojo() {
	super();
}
public AddressPojo(String state, String city, String country) {
	
	this.state = state;
	this.city = city;
	this.country = country;
}

}
