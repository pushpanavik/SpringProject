package com.bridgeit.springBeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobilePhoneMain {

	public static void main(String[] args) {
	
		ApplicationContext factory=new AnnotationConfigApplicationContext(PhoneConfiguration.class);
		System.out.println(1);
		
		SamsungImpl samsung=factory.getBean(SamsungImpl.class);
		samsung.getSamsungDetails();
		System.out.println(2);
		System.out.println("samsung details completed");
		
		Nokia nokia=factory.getBean(Nokia.class);
		nokia.getNokiaDetails();
		System.out.println(3);
		System.out.println("nokiaaaaaaa");
		

	}

}
