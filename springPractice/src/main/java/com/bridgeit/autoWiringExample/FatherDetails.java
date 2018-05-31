package com.bridgeit.autoWiringExample;

public class FatherDetails{
	private String Name;
	private int age;
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
	public FatherDetails(String name, int age) {
		
		this.Name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Father [Name=" + Name + ", age=" + age + "]";
	}
	
	
}

	




	
	
	

