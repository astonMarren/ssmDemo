package com.jshx.controler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jshx.entity.Student;
import com.jshx.util.RedisService;

@Controller
@RequestMapping("/student")
public class StudentAction {
	@Autowired
	private RedisService redisService;
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	
/*	@RequestMapping("/getStudent")
	public String getStudent(Student student, Model model) {
		System.out.println(student.getName());
		System.out.println(student.getId());
		student.setName("李四");
		model.addAttribute("student",student);
		return "jsp/studentList.jsp";
	}*/
	
	@RequestMapping("/getStudent")
	public @ResponseBody Map getStudent() {
		Map<String,Object> map = new HashMap<String,Object>(); 
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setName("张三");
		student1.setId(123);
		Student student2 = new Student();
		student2.setName("李四");
		student2.setId(456);
		list.add(student1);
		list.add(student2);
		map.put("size", list.size());
		map.put("list", list);
		return map;
	}
}
