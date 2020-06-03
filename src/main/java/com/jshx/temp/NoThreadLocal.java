package com.jshx.temp;

public class NoThreadLocal {
	static int count;
	
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
			count = id;
			System.out.println(Thread.currentThread().getName()+ ":" + count);
			
		}
		
	}
	
	public static void main(String[] args) {
		NoThreadLocal noThreadLocal = new NoThreadLocal();
		noThreadLocal.StartThreadArray();
	}
}
