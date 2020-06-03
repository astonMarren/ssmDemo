import java.util.List;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jshx.entity.Student;
import com.jshx.service.StudentService;
import com.jshx.service.impl.StudentServiceImpl;
import com.jshx.util.RedisService;

public class RedisTest {
    /*
    * 1. 创建spring容器
           根据xml文件应用程序Context容器(上下文)
           classpath指配置文件的位置, 起点有java, resources. 写路径时相对这个起点去写
    * */
    //static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
 
    @Test
    public void test1(){
    	@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("../classes/spring/applicationContext.xml");
    	RedisService redisService = (RedisService)context.getBean("redisService");
    	boolean set = redisService.set("yyy", "wang",10);
    	System.out.println(redisService.get("yyy"));
    }
}
