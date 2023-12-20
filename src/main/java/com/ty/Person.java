package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	Mobile mobile;
	
	public void personMethod()
	{
		System.out.println("Method From The Person");
		mobile.interfaceMethod();
		
	}

}
