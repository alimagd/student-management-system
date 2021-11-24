package com.ali.sms.repository;

import com.ali.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository  we do not need add this @ on here because JpaRepository inherits
public interface StudentRepository extends JpaRepository<Student,Long> {
}
