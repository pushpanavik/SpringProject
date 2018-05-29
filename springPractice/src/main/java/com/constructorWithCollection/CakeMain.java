package com.constructorWithCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CakeMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("collection.xml");
		CakeShop cakeShop=(CakeShop)applicationContext.getBean("q");
		cakeShop.show();
	}

}
