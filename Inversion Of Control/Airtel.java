package com.tanmay.SpringBoot.IOC;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim{

	@Override
	public void calling() 
	{
		System.out.println("Airtel Sim is Calling...");
	}

	@Override
	public void internet() 
	{
		System.out.println("Airtel Sim Internet...");
	}

}
