package com.mkyong.service.teacher;

import com.mkyong.dto.TeacherDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    public List<TeacherDto> getAllTeacher() {
        List<TeacherDto> teacherDtos = new ArrayList<>();
        TeacherDto teacherDto = new TeacherDto();
        teacherDto.setSubjectTeach("math");
        teacherDto.setTeacherName("maryam");
        teacherDtos.add(teacherDto);

        return teacherDtos;
    }
}
