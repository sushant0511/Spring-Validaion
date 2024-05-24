package com.java.test.SpringValidation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Voter {

	@NotNull
	@Size(min = 2, max=25)
	String name;
	
	@NotNull
	@Min(18)
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
