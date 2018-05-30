package com.bridgeit.springPractice;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class StudentPojo {

private List list;
private Set set;
private Map map;



public void setList(List list) {
	this.list = list;
}



public Set getSet() {
	return set;
}



public void setSet(Set set) {
	this.set = set;
}



public Map getMap() {
	return map;
}



public void setMap(Map map) {
	this.map = map;
}


@Override
public String toString() {
	return "StudentPojo [list=" + list + ", set=" + set + ", map=" + map + "]";
} 

}
