package com.mkyong.service.student;

import com.mkyong.dto.StudentDto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudent();
}
