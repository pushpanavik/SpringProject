package com.bridgeit.autoWiringExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class FamilyDetails {

	public static void main(String[] args) {
		
		Resource resource=new ClassPathResource("familyDetails.xml");
		System.out.println(1);
		
		BeanFactory factory=new XmlBeanFactory(resource);
		System.out.println(2);
		
		FatherDetails fatherDetails=(FatherDetails) factory.getBean("fatherDetails");
		System.out.println(3);
		
		System.out.println(fatherDetails.toString());
		System.out.println(4);
		
		Mother mother=(Mother) factory.getBean("mother");
		System.out.println(5);
		
		System.out.println(mother.toString());
		System.out.println(6);

	}

}
