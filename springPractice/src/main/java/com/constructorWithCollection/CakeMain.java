package com.constructorWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CakeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collection.xml");
		System.out.println(1);
		CakeShop cakeShop=(CakeShop)applicationContext.getBean("q");
		System.out.println(2);
		cakeShop.show();
		System.out.println(3);
	}

}
