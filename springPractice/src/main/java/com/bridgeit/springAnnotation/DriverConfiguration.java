package com.bridgeit.springAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan()
public class DriverConfiguration {

	//@Bean
	public MySqlDriver goSQl()
	{
		System.out.println("entered into bean of sql driver");
		return new MySqlDriver();
	}
	
	//@Bean
	@Lazy
	public JdbcDriver goJdbc()
	{
		System.out.println("entered into bean of jdbc driver");
		return new JdbcDriver();
	}
	
	//@Bean
	public MongoDBDriver goWithMongo()
	{
		System.out.println("entered into bean of mongo db");
		return new MongoDBDriver();
	}
	
}
