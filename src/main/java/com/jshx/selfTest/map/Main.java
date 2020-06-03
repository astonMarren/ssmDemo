package com.jshx.selfTest.map;

import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(10);
		s1.setName("张三");
		Student s2 = new Student();
		s2.setAge(10);
		s2.setName("张三");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		HashMap hashMap = new HashMap();
		hashMap.put(s1, "value1");
//		hashMap.put(s2, "value2");
//		System.out.println(hashMap.get(s1));
		System.out.println(hashMap.get(s2));
	}
}
