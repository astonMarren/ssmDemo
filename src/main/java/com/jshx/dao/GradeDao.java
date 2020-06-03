package com.jshx.dao;

import java.util.List;
import com.jshx.entity.Grade;

public interface GradeDao {
	List<Grade> selectGrade();
	Grade findById(int id);
}
