package com.bridgeit.springPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("studentbean.xml");
		
		StudentPojo studentPojo=(StudentPojo) applicationContext.getBean("studentbean");
		StudentPojo s=(StudentPojo) applicationContext.getBean("studentbean");
		StudentPojo s1=(StudentPojo)applicationContext.getBean("studentbean");
		
		System.out.println(studentPojo.toString());
	}

}
