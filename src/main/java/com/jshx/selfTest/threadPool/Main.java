package com.jshx.selfTest.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.jshx.entity.Student;

public class Main {
	Executor executor;
	ExecutorService executorService;
	Executors executors;
	
	Object o = new Object();
	Student s = new Student();
	int h = s.hashCode();
} 
