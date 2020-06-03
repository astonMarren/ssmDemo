package com.jshx.selfTest.aop;

import org.springframework.beans.factory.FactoryBean;

/**
 * 1、自己是一个bean
 * 2、getObject 返回的对象也是一个bean
 *
 * 只能返回一个mapper
 */


public class EnjoyFactoryBean implements FactoryBean {

	Class mapperInterface;

	public void setMapperInterface(Class mapperInterface) {
		this.mapperInterface = mapperInterface;
	}

	@Override
	public Object getObject() throws Exception {
		Object object =  EnjoySession.getMapper(mapperInterface);
		return object;
	}

	@Override
	public Class<?> getObjectType() {
		return mapperInterface;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}
}
