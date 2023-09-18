package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepositories;
import com.learnSphere.repositories.LessonRepositories;

@Service
public class StudentServiceImplementation implements StudentService {

	@Autowired
	CourseRepositories repo;
	
	@Autowired
	LessonRepositories lrepo;
	
	@Override
	public List<Course> fetchCourseList() {
		
		return repo.findAll();
	}
	@Override
	public Course fetchCourse(int courseId) {
		return repo.findByCourseId(courseId);
	}
	@Override
	public Lesson getLesson(int lessonId) {
		return lrepo.findByLessonId(lessonId);
	}

}
