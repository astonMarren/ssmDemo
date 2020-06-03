package com.jshx.selfTest.aop;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class EnjoyHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println("conn");
		Select annotation = method.getAnnotation(Select.class);

		String sql = method.getAnnotation(Select.class).value()[0];

		System.out.println(sql);

		return null;
	}
}
