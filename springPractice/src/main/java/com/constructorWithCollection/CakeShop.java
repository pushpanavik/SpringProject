package com.constructorWithCollection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CakeShop {
	private String cakeName;
	private String type;
	private List<String> list;
	private Set<String>set;
	private Map<String,String>map;
	
	
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


	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}


	public Set<String> getSet() {
		return set;
	}


	public void setSet(Set<String> set) {
		this.set = set;
	}


	public Map<String, String> getMap() {
		return map;
	}


	public void setMap(Map<String, String> map) {
		this.map = map;
	}


	public CakeShop(String cakeName, String type, List<String> list, Set<String> set, Map<String, String> map) {
		this.cakeName = cakeName;
		this.type = type;
		this.list = list;
		this.set = set;
		this.map = map;
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
