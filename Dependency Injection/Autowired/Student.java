package com.tanmay.DependencyInjection.Autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component   /* It is used to give the object of this class to spring container...*/
//@Scope(value = "prototype")   /* To create more than one object we have to take @Scope annotation and make this @Scope annotation's value = prototype like @Scope(value="prototype") */
public class Student {
	private int sId;
	private String name;
	
	@Autowired  // It will connect to object near by itself. /* By Default, @Autowired searches by type of class. i.e created by spring. Example :- "Student" class --> "student" object */
	@Qualifier("cool")  // It will search for "cool" object. /* @Qualifier searches by custom object reference name given by Programmer of "Student" class. */
	private College college;
	
	public College getCollege() {
		return college;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}

	public Student() {
		System.out.println("Student Object Created...");
	}
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void something()
	{
		System.out.print("Course Name :- ");
		college.course();
	}
}
