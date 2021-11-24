package com.ali.sms.service;

import com.ali.sms.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentList();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
