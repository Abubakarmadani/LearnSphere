package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repositories.CourseRepositories;
import com.learnSphere.repositories.LessonRepositories;

@Service
public class TrainerServiceImplementation implements TrainerService{
@Autowired
CourseRepositories repo;
@Autowired
LessonRepositories lrepo;
	@Override
	public String addCourse(Course course) {
		repo.save(course);
		return "Course added";
	}
	@Override
	public List<Course> fetchAllCourse() {
		return repo.findAll();
	}
	@Override
	public String addLesson(Lesson lesson) {
		lrepo.save(lesson);
		return "Lesson added";
	}
	@Override
	public String saveCourse(Course course) {
	repo.save(course);
		return "course updated";
	}
	

}
