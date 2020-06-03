package com.jshx.dao;

import java.util.List;

import com.jshx.entity.Student;

public interface StudentDao {
	List<Student> selectAllStudent();
	Student findById(int id);
	void insertStudent(Student student);
}
