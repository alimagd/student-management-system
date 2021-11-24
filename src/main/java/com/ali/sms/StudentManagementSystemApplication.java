package com.ali.sms;

import com.ali.sms.entity.Student;
import com.ali.sms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication  {

    public static void main(String[] args) {

        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

//
//    @Override
//    public void run(String... args) throws Exception {
//
////        Student student1 = new Student("Ali", "Majidi", "alimail@y.com");
////        Student student2 = new Student("Priscila", "Rose", "prismail@y.com");
////        Student student3 = new Student("Hamid", "Majidi", "hamidmail@y.com");
////        Student student4 = new Student("Aba", "Mehri", "abamail@y.com");
////        studentRepository.save(student1);
////        studentRepository.save(student2);
////        studentRepository.save(student3);
////        studentRepository.save(student4);
//    }
}
