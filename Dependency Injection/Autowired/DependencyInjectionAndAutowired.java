package com.tanmay.DependencyInjection.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionAndAutowired {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionAndAutowired.class, args);
		
		/* It will create the object of Student Class regardless of comment out this, 
				Because,By default, Spring Framework uses the concept of a Singleton Design Pattern.
				
		-----> If you use "prototype" then it must need getBeans() to create object otherwise it will not create object. 
				
		--> It is not possible to create more than one object due to singleton class.  
		
		-------> To create more than one object we have to take @Scope annotation and make this @Scope annotation's value = prototype like @Scope(value="prototype") */
		
		Student student1 = context.getBean(Student.class);
		student1.something();
		
//		Student student2 = context.getBean(Student.class);
//		student2.something();
		
	}

}
