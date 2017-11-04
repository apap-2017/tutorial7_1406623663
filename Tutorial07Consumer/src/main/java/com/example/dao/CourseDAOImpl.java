package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.example.model.CourseModel;
import com.example.model.StudentModel;

@Service
public class CourseDAOImpl implements CourseDAO {

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public CourseModel selectCourse(String id_course) {
		CourseModel course = restTemplate.getForObject("http://localhost:8080/rest/course/view/" + id_course,
				CourseModel.class);
		return course;
	}

	@Override
	public List<CourseModel> selectAllCourse () {
		List<CourseModel> courses = restTemplate.getForObject("http://localhost:8080/rest/course/viewall",List.class);
		return courses;
	}

	
	
}
