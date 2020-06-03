package com.jshx.selfTest.proxy;

public class CarImpl implements CarInterface {

	@Override
	public String getCar(String name) {
		System.out.println("你已获得" + name + "汽车");
		return "get";
	}

}
