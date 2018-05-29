package com.bridgeit.springPractice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpMain {
	static Employee e;
	public static void main(String args[])
	{
		/*using Constructor injection*/
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		e=(Employee) applicationContext.getBean("emp");
		
		
		Resource resource=new ClassPathResource("beans.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		e=(Employee) beanFactory.getBean("emp");
		e.show();
		
		//Using Setter
		
		
	}
}
