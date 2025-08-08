package com.tnsif.Springcore_Example;

import org.springframework.stereotype.*;

@Component
public class Student {
	private String name;
	
	public Student()//default Constructor
	{
		System.out.println("Student object is created..");
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void display() {
		System.out.println("Student:"+name);
	}
}
