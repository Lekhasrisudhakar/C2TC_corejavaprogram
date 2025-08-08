package com.tnsif.Springcore_Example;
import org.springframework.stereotype.Component;
@Component
public class College {
	private Student student;
	
	public void setStudent(Student student)
	{
		this.student = student;
	}
	public void display()
	{
		System.out.println("Manakulam");
		student.display();
	}
	public College()
	{
		System.out.println("College object is created");
	}
}
