package com.iiuc.cse.b58.s3f.g5.iiuc_course_api.repository;

import com.iiuc.cse.b58.s3f.g5.iiuc_course_api.model.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CourseRepository {

    private List<Course> courseList = new ArrayList<Course>();

    //Save a Course
    public void saveCourse(Course course)
    {
        courseList.add(course);
    }

    //Save Multiple Course
    public void saveCourses(List<Course> courses)
    {
        for(Course c:courses) {
            courseList.add(c);
        }
    }

    //Get All course
    public List<Course> findAll()
    {
        return courseList;
    }

    //Get Course by ID
    public Optional<Course> findById(Long id)
    {
        return courseList.stream().filter(c->c.getId().equals(id)).findFirst();
    }

    public Optional<Course> findByCourseCode(String code)
    {
        return courseList.stream().filter(c -> c.getCourseCode().equals(code)).findFirst();
    }


    //Update Course by ID
    public Course updateCourse(Course course)
    {
        findById(course.getId()).ifPresent(existing ->
        {
            existing.setCourseCode(course.getCourseCode());
            existing.setCourseTitle(course.getCourseTitle());
            existing.setCourseCredit(course.getCourseCredit());
            existing.setCourseType(course.getCourseType());
            existing.setSemester(course.getSemester());
            existing.setCourseTeacher(course.getCourseTeacher());
        });

        return course;
    }

    //Delete Course by ID
    public boolean deleteById(Long id)
    {
        return courseList.removeIf(c->c.getId().equals(id));
    }


}
