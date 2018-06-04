package com.bridgeit.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LaptopInfo")
public class LaptopInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	@Column
	private String companyName;
	@Column
	private String Processor;
	@Column
	private String color;
	@Column
	private String Ram;
	@Column
	private String modelNo;

	public LaptopInfo() {

	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProcessor() {
		return Processor;
	}

	public void setProcessor(String processor) {
		Processor = processor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

}
