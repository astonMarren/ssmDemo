package com.jshx.selfTest.aop;

import java.lang.reflect.Proxy;

public class EnjoySession {

	public static Object getMapper(Class clazz){
		Class[] classes = new Class[]{clazz};
		Object o = Proxy.newProxyInstance(EnjoySession.class.getClassLoader(),classes,new EnjoyHandler());
		return o;
	}


}
