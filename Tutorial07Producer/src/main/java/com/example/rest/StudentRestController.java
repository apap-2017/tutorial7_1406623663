package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.StudentModel;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class StudentRestController {
	@Autowired
	StudentService studentService;

	
	//after
	@RequestMapping("/student/view/{npm}")
	public StudentModel view(@PathVariable(value = "npm") String npm) {
		StudentModel student = studentService.selectStudent(npm);
		return student;
	}
	
	//before
//    @RequestMapping("/student/view/{npm}")
//    public String viewPath (Model model,
//            @PathVariable(value = "npm") String npm)
//    {
//        StudentModel student = studentDAO.selectStudent (npm);
//
//        if (student != null) {
//            model.addAttribute ("student", student);
//            return "view";
//        } else {
//            model.addAttribute ("npm", npm);
//            return "not-found";
//        }
    
	
    @RequestMapping("/student/viewall")
    public  List<StudentModel> view ()
    {
        List<StudentModel> students = studentService.selectAllStudents ();
        return students;
    }
    
}