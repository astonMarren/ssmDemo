package com.jshx.jdbc;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

/**
 * 
* @ClassName: DataSourceExchange
* @Description: 切面方法
* @author Wangjiteng
* @date 2020年4月15日 上午11:00:41
*
 */
public class DataSourceExchange {
	/**
	 *
	 * @param point
	 */
	//@Before
	public void before(JoinPoint point) {

		// 获取目标对象的类类型
		Class<?> aClass = point.getTarget().getClass();
	
		// 获取包名用于区分不同数据源
	/*	String whichDataSource = aClass.getName().substring(15, aClass.getName().lastIndexOf("."));
		if ("ssmone".equals(whichDataSource)) {
			DataSourceHolder.setDataSources(Constants.DATASOURCE_ONE);
		} else {
			DataSourceHolder.setDataSources(Constants.DATASOURCE_TWO);
		}*/
		// 根据方法名区分不同的数据源
		Method method = ((org.aspectj.lang.reflect.MethodSignature) point.getSignature()).getMethod();
		String name = method.getName();
		System.out.println(name);
		if (name.startsWith("find") || name.startsWith("get") || name.startsWith("query") 
				|| name.startsWith("select")) {
			DataSourceHolder.setDataSources(Constants.DATASOURCE_READ);
			System.out.println("获取读数据源");
		} else {
			DataSourceHolder.setDataSources(Constants.DATASOURCE_WRITE);
			System.out.println("获取写数据源");
		}
	}

	/**
	 * 执行后将数据源置为空
	 */
	public void after() {
		DataSourceHolder.setDataSources(null);
	}
}
