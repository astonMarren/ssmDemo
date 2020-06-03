package com.jshx.selfTest.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

	public static void main(String[] args) {
//		ReentrantLock lock = new ReentrantLock();
//		lock.lock();
		CustomLock lock = new CustomLock();
		lock.lock();
		System.out.println("lock");
		lock.unLock();
	}
}
