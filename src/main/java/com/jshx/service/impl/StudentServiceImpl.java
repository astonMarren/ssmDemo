package com.jshx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jshx.dao.StudentDao;
import com.jshx.entity.Student;
import com.jshx.service.StudentService;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> selectAllStudent() {
		return studentDao.selectAllStudent();
	}

	@Override
	public Student findById(int id) {
		return studentDao.findById(id);
	}

	@Override
	public void insertStudent(Student student) {
		studentDao.insertStudent(student);
		
	}

}
