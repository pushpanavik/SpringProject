package com.bridgeit.autoWiringExample;

public class Children {
	private String name;
	private int age;
	private FatherDetails fatherDetails;
	private Mother motherDetails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FatherDetails getFatherDetails() {
		return fatherDetails;
	}
	public void setFatherDetails(FatherDetails fatherDetails) {
		this.fatherDetails = fatherDetails;
	}
	public Mother getMotherDetails() {
		return motherDetails;
	}
	public void setMotherDetails(Mother motherDetails) {
		this.motherDetails = motherDetails;
	}
	
	public Children(String name, int age, FatherDetails fatherDetails, Mother motherDetails) {
		
		this.name = name;
		this.age = age;
		this.fatherDetails = fatherDetails;
		this.motherDetails = motherDetails;
	}
	@Override
	public String toString() {
		return "Childrens [name=" + name + ", age=" + age + ", Father Details=" + fatherDetails + ", Mother Details="
				+ motherDetails + "]";
	}
}
