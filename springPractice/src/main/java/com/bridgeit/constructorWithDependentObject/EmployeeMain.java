package com.bridgeit.constructorWithDependentObject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class EmployeeMain {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Employee e=(Employee)beanFactory.getBean("car");
		System.out.println(e.getId()+"  "+e.getName()+" "+e.getSalary()+ " "+e.getAddress());
		
		
	}
}
