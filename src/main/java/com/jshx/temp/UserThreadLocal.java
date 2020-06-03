package com.jshx.temp;

public class UserThreadLocal {
	static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
	
	public void StartThreadArray() {
		Thread[] runs = new Thread[3];
		for (int i = 0; i < runs.length; i++) {
			runs[i] = new Thread( new ThreadTest(i));
		}
		for (int i = 0; i < runs.length; i++) {
			runs[i].start();
		}
	}
	
	public static class ThreadTest implements Runnable{
		int id;
		public ThreadTest(int id) {
			this.id = id;
		}
		@Override
		public void run() {
			threadLocal.set(id);
			threadLocal.get();
			System.out.println(Thread.currentThread().getName()+ ":" + threadLocal.get());
			
		}
		
	}
	
	public static void main(String[] args) {
		UserThreadLocal userThreadLocal = new UserThreadLocal();
		userThreadLocal.StartThreadArray();
	}
}

