package com.jshx.dao2;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jshx.entity.School;
/**
 * 
    * @ClassName: SchoolDao
    * @Description: 对应applicationContext.xml文件 mapper注入，可以不写实现类，由MapperFactoryBean动态代理生成实现类
    * @author 33718
    * @date 2020年5月8日
    *
 */
@Mapper
public interface SchoolDao {
	//public School getSchoolById();
	public List<School> getSchoolListByMap(Map map);
	public void insertSchool(School school);
}
