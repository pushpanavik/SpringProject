package com.bridgeit.springAnnotation;

import org.springframework.stereotype.Component;

@Component

public class JdbcDriver {
	public void getJdbcDriver()
	{
		System.out.println("calling to jdbc");
	}
}
