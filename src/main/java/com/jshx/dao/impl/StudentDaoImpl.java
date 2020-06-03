package com.jshx.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.jshx.dao.StudentDao;
import com.jshx.entity.Student;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Student> selectAllStudent() {
		System.out.println("======selectAllStudent====");
		 return this.sqlSession.selectList("studentMapper.selectAllStudent");
	}

	@Override
	public Student findById(int id) {
		 return this.sqlSession.selectOne("gradeMapper.findById", id);
	}

	@Override
	public void insertStudent(Student student) {
		this.sqlSession.insert("studentMapper.insertStudent",student);
	}

}
