package com.constructorWithCollection;

import java.util.Iterator;
import java.util.List;

public class CakeShop {
	private String cakeName;
	private String type;
	private List<String> list;
	
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public CakeShop(String cakeName, String type,List l) {
		this.cakeName = cakeName;
		this.type = type;
		this.list=l;
	}
	public void show()
	{
		System.out.println(type+ " "+cakeName);
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	
	

}
