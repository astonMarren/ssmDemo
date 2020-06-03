package com.jshx.temp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Map map = new Hashtable();
		map.get("");
		ConcurrentHashMap cMap = new ConcurrentHashMap();
		cMap.get("");
		ExecutorService executor = Executors.newCachedThreadPool();
		Callable<String> myCall = new Callable<String>() {
			@Override
			public String call(){
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("calld方法执行了");
				return "call方法返回值";
			}
		};
		
		Callable<String> myCall2 = new Callable<String>() {
			@Override
			public String call(){
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("calld2方法执行了");
				return "call2方法返回值";
			}
		};
		
		System.out.println("提交任务之前 "+getStringDate());
		Future future = executor.submit(myCall);
		Future future2 = executor.submit(myCall2);
		System.out.println("提交任务之后，获取结果之前 "+getStringDate());
		System.out.println("获取返回值: "+future.get());
		System.out.println("获取返回值: "+future2.get());
		System.out.println("获取到结果之后 "+getStringDate());
		executor.shutdown();
	}
	
	
	public static String getStringDate() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}
}
