package com.bridgeit.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverMain {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	ApplicationContext factory=new AnnotationConfigApplicationContext(DriverConfiguration.class);
	System.out.println(1);
	MySqlDriver mysql=factory.getBean(MySqlDriver.class);
	System.out.println(2);
	mysql.getSQLDriver();
	System.out.println(3);
	
	JdbcDriver driver=factory.getBean(JdbcDriver.class);
	System.out.println(4);
	driver.getJdbcDriver();
	System.out.println(5);
	
	MongoDBDriver mog=factory.getBean(MongoDBDriver.class);
	System.out.println(6);
	mog.getMongoDBDriver();
	System.out.println(7);
	
}
}
