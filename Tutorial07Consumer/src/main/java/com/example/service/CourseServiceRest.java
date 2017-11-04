package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dao.CourseDAO;
import com.example.model.CourseModel;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Primary
public class CourseServiceRest implements CourseService {

	@Autowired
	private CourseDAO courseDAO;
	
	@Override
    public     CourseModel    selectCourse   ( String id_course)
       {
         log . info    ( "REST   -   select   course   with   id_course  {}" ,id_course );              
       return courseDAO.selectCourse(id_course);
       }
	
	@Override
        public     List < CourseModel >    selectAllCourses ()        
		{
          log . info    ( "REST   -   select   all   course" );
          List<CourseModel> courses = courseDAO.selectAllCourse();
          return courses;
		}
	 
	

//	@Override
//        public void addCourse (StudentModel  student ){}
//
//	@Override
//        public void deleteCourse  (String npm ){}
//
//	@Override
//	public void updateStudent (StudentModel student )     {}
//
//	@Override
//	public void addCourse ( String npm, String idCourse )  {}
//
//	@Override
//	public CourseModel selectCourse(String id_course) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
//    @Override
//    public CourseModel selectCourse(String id){
//        CourseModel course = new CourseModel();
//        return course;
//    }

	
	

}