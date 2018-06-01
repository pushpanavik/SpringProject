package com.bridgeit.springBeanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PhoneConfiguration {

	/*@Bean
	public Samsung config()
	{
		System.out.println("come under samsung bean");
		return new Samsung();
	}*/
	
	@Bean
	public Nokia configure()
	{
		System.out.println("comes under nokia bean");
		return new Nokia();
	}
	@Bean
	public IMobileProcessor getProcessor()
	{
		System.out.println("come under interface bean");
		return new SamsungImpl();
	}
}
