package com.tanmay.DependencyInjection.Autowired;

import org.springframework.stereotype.Component;

@Component("cool")  // It will create "cool" object reference for this class.
					/* If you do not give any name here, it will search by default object reference name of that class. */
public class College {
	private String name;
	private int cId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", cId=" + cId + "]";
	}
	
	public void course()
	{
		System.out.println("Master of Computer Application(MCA)");
	}
}
