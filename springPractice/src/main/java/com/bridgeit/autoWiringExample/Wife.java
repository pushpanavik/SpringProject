package com.bridgeit.autoWiringExample;

class Wife{
	private String Name;
	private int age;
	private Husband husbandDetails;
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
	public Husband getHusbandDetails() {
		return husbandDetails;
	}
	public void setHusbandDetails(Husband husbandDetails) {
		this.husbandDetails = husbandDetails;
	}
	public Wife(String name, int age, Husband husbandDetails) {
		Name = name;
		this.age = age;
		this.husbandDetails = husbandDetails;
	}
	@Override
	public String toString() {
		return "Wife [Name=" + Name + ", age=" + age + ", husbandDetails=" + husbandDetails + "]";
	}
	
	
}