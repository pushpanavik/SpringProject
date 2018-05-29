package com.bridgeit.springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("studentbean.xml");
		StudentPojo studentPojo=(StudentPojo) applicationContext.getBean("studentbean");
		studentPojo.display();
	}

}
