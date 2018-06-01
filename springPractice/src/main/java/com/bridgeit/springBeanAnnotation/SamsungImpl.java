package com.bridgeit.springBeanAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class SamsungImpl implements IMobileProcessor {

	public void getSamsungDetails()
	{
		System.out.println("this is samsung bean");
		mobileProcessor.getConfigDetail();
	}
	
	@Autowired
	IMobileProcessor mobileProcessor;

	public void getConfigDetail() {
		System.out.println(5);
		
	}
	
}
 class Nokia{
	 public void getNokiaDetails()
	 {
		 System.out.println("this is nokia bean"); 
	 }
 }
