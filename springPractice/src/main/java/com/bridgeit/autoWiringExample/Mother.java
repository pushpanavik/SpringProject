package com.bridgeit.autoWiringExample;


public class Mother {
	private String Name;
	private int age;
	private FatherDetails father;
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
	public FatherDetails getFatherDetails() {
		return father;
	}
	public void setFatherDetails(FatherDetails fatherDetails) {
		this.father = fatherDetails;
	}
	public Mother(String name, int age, FatherDetails fatherDetails) {
		
		this.Name = name;
		this.age = age;
		this.father = fatherDetails;
	}
	@Override
	public String toString() {
		return "Mother [Name=" + Name + ", age=" + age + ", fatherDetails=" + father + "]";
	}
	
	
}
