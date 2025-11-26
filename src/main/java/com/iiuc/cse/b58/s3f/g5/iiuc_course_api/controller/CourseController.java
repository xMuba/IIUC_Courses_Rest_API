package com.iiuc.cse.b58.s3f.g5.iiuc_course_api.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/courses")
public class CourseController {
    

    //for testing the setup run and search http://localhost:8080/api/courses/hello
    @GetMapping("/hello")
    public String getMethodName() {
        return "Hello from Controller";
    }
    
}
