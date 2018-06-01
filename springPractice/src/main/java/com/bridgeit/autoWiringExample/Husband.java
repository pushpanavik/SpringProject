package com.bridgeit.autoWiringExample;


class Husband{
	private String Name;
	private int age;
	
	private Wife wifeDetails;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Wife getWifeDetails() {
		return wifeDetails;
	}
	public void setWifeDetails(Wife wifeDetails) {
		this.wifeDetails = wifeDetails;
	}
	
	
	public Husband() {
		super();
	}
	public Husband(String name, int age,Wife wifeDetails) {
		
		this.Name = name;
		this.age = age;
		
		this.wifeDetails = wifeDetails;
		
	}
	@Override
	public String toString() {
		return "Husband [Name=" + Name + ", age=" + age + ",  Wife Details="
				+ wifeDetails + "]";
	}
}