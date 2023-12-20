package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	@Autowired
	static Mobile mobile;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Confi.class);
		Person person=(Person)context.getBean("person");	
		
	   person.personMethod();
	}

}
