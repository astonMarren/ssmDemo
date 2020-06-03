package com.jshx.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jshx.dao.GradeDao;
import com.jshx.entity.Grade;
import com.jshx.entity.Student;

@Repository("gradeDao")
public class GradeDaoImpl implements GradeDao {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Grade> selectGrade() {
		 return this.sqlSession.selectList("gradeMapper.selectAllGrade");
	}

	@Override
	public Grade findById(int id) {
		 return this.sqlSession.selectOne("gradeMapper.findById", id);
	}

}
