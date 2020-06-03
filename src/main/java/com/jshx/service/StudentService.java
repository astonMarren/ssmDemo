package com.jshx.service;

import java.util.List;

import com.jshx.entity.Student;

public interface StudentService {
	List<Student> selectAllStudent();
	Student findById(int id);
	void insertStudent(Student student);
}
