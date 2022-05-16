package com.hcl.javajunit.student.repository;

import java.util.List;

import com.hcl.javajunit.student.model.Student;


public interface StudentRepository {

    List<Student> findAll();

    Student findOne(Long id);

    boolean isDataFromMemory();
}