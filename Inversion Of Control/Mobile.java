package com.tanmay.SpringBoot.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan("com.tanmay.SpringBoot.IOC")
public class Mobile 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(Mobile.class);
    	Sim sim = context.getBean(Jio.class);
    	sim.calling();
    	sim.internet();
    	
    }
}
