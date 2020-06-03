package com.jshx.selfTest.lock;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

import sun.misc.Unsafe;

public class CustomLock {
	volatile int status = 0;
	//private static final Unsafe unsafe = Unsafe.getUnsafe();
	//private static long stateOffset = unsafe.objectFieldOffset(AbstractQueuedSynchronizer.class.getDeclaredField("state"));
	public void lock() {
		while(!compareAndSet(0,1)) {
			//自旋
		}
		//lock
	}
	
	public void unLock() {
		status = 0;
	}
	boolean compareAndSet(int expect, int update) {
		 //return unsafe.compareAndSwapInt(this, expect, update);
		if (this.status == expect) {
			status = update;
			return true;
		}
		return false;
	}
}


