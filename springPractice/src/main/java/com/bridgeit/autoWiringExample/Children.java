package com.bridgeit.autoWiringExample;

public class Children {
	private String name;
	private int age;
	private Mother father1;
	private FatherDetails fatherDetails;
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
	public Mother getFather() {
		return father1;
	}
	public void setFather(Mother father) {
		this.father1 = father;
	}
	public FatherDetails getFatherDetails() {
		return fatherDetails;
	}
	public void setFatherDetails(FatherDetails fatherDetails) {
		this.fatherDetails = fatherDetails;
	}
	public Children(String name, int age, Mother father, FatherDetails fatherDetails) {
		super();
		this.name = name;
		this.age = age;
		this.father1 = father;
		this.fatherDetails = fatherDetails;
	}
	@Override
	public String toString() {
		return "Children [name=" + name + ", age=" + age + ", father=" + father1 + ", fatherDetails=" + fatherDetails
				+ "]";
	}
	
	
	
}
