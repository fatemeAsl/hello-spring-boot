package com.mkyong.service.student;

public class StudentServiceFactory {
    public static StudentService get() {
        return new StudentServiceImpl();
    }
}
