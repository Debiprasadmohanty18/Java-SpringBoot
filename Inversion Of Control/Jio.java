package com.tanmay.SpringBoot.IOC;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {

	@Override
	public void calling() 
	{
		System.out.println("Jio Sim Calling...");
	}

	@Override
	public void internet() 
	{
		System.out.println("Jio Sim Internet...");
	}

}
