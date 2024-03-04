package com.mkyong;

import com.mkyong.dto.StudentDto;
import com.mkyong.dto.TeacherDto;
import com.mkyong.service.student.StudentService;
import com.mkyong.service.teacher.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class HelloController {
    private final StudentService serviceStudent;
    private final TeacherService teacherService;

    @Autowired
    public HelloController(StudentService serviceStudent, TeacherService teacherService) {
        this.serviceStudent = serviceStudent;
        this.teacherService = teacherService;
    }

    @GetMapping("/welcome")
    String hello() {
        return "Hello World, Spring Boot!";
    }

    @GetMapping("/studentList")
    List<StudentDto> getStudent() {
        return serviceStudent.getAllStudent();
    }

    @GetMapping("/teacherList")
    List<TeacherDto> getTeacher() {
        return teacherService.getAllTeacher();
    }

}