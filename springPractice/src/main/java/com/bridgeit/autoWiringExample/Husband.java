package com.bridgeit.autoWiringExample;

class Husband{
	private String Name;
	private int age;
	private FatherDetails fatherDetails;
	private Wife wifeDetails;
	private Mother motherDetails;
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
		return fatherDetails;
	}
	public void setFatherDetails(FatherDetails fatherDetails) {
		this.fatherDetails = fatherDetails;
	}
	public Wife getWifeDetails() {
		return wifeDetails;
	}
	public void setWifeDetails(Wife wifeDetails) {
		this.wifeDetails = wifeDetails;
	}
	public Mother getMotherDetails() {
		return motherDetails;
	}
	public void setMotherDetails(Mother motherDetails) {
		this.motherDetails = motherDetails;
	}
	public Husband(String name, int age, FatherDetails fatherDetails, Wife wifeDetails, Mother motherDetails) {
		
		this.Name = name;
		this.age = age;
		this.fatherDetails = fatherDetails;
		this.wifeDetails = wifeDetails;
		this.motherDetails = motherDetails;
	}
	@Override
	public String toString() {
		return "Husband [Name=" + Name + ", age=" + age + ", Father Details=" + fatherDetails + ", Wife Details="
				+ wifeDetails + ", Mother Details=" + motherDetails + "]";
	}
}