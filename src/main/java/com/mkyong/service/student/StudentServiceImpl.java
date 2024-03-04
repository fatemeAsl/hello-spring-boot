package com.mkyong.service.student;

import com.mkyong.dto.StudentDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentServiceImpl implements StudentService {
    @Override
    public List<StudentDto> getAllStudent() {
        List<StudentDto> studentList = new ArrayList<>();
        StudentDto studentDto = new StudentDto();
        studentDto.setfName("fateme");
        studentDto.setlName("javadi");
        studentDto.setAge(21);
        studentList.add(studentDto);
        return studentList;
    }
}
