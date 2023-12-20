package com.ty;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Moto implements Mobile {

	public void interfaceMethod() {
		
		System.out.println("Hello From Moto");
	}

}
