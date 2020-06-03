package com.jshx.selfTest.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class MyBeanDefinitionRegistry implements BeanDefinitionRegistryPostProcessor{

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		GenericBeanDefinition bd = new GenericBeanDefinition();
		bd.setBeanClass(Student.class);
		bd.setBeanClassName(Student.class.getName());
		//设置scope
		bd.setScope("singleton");
		//设置是否懒加载
		bd.setLazyInit(false);
		//设置是否可以被其他对象自动注入
		bd.setAutowireCandidate(true);
		
		// 给属性赋值
		MutablePropertyValues mpv = new MutablePropertyValues() ;
		mpv.add("name", "张三") ;
		mpv.add("age", 18) ;
		bd.setPropertyValues(mpv);
		
		registry.registerBeanDefinition("student", bd);
	}
	
	
	
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		
	}

	    
	

}
