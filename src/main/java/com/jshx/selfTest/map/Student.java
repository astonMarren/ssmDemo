package com.jshx.selfTest.map;

public class Student {
	private String name;
	private int age;
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
	public boolean equals(Object obj) {
		Student s2 = (Student)obj;
		return this.getAge() == s2.getAge() && this.getName().equals(s2.getName());
	}
	
	
}
