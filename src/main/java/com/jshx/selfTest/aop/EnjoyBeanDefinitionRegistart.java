package com.jshx.selfTest.aop;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class EnjoyBeanDefinitionRegistart implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//EnjoyFactoryBean----spring 容器已经可以实例化他了
		//spring实例化的过程当中 能不能穿一个参数给他---class
		//"com.enjoy.dao"
		/*BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(EnjoyFactoryBean.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		beanDefinition.getPropertyValues().add("mapperInterface", TDao.class);
		registry.registerBeanDefinition("xxx",beanDefinition);*/
	}
}
