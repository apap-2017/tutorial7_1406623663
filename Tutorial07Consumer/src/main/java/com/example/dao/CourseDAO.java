package com.example.dao;

import java.util.List;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

public interface CourseDAO {
	

	CourseModel selectCourse(String id_course);

	List<CourseModel> selectAllCourse();
}