package com.hcl.javajunit.student.repository;

import java.util.Arrays;
import java.util.List;

import com.hcl.javajunit.student.model.Student;

public class MemoryStudentRepository implements StudentRespository {

    private static List<Student> DATA = Arrays.asList(
            new Student(1L, "mkyong", 38),
            new Student(2L, "jack", 40)
    );

    @Override
    public List<Student> findAll() {
        return DATA;
    }

    @Override
    public Student findOne(Long id) {
        return DATA.stream().filter(x -> x.getId() == id).findFirst().orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public boolean isDataFromMemory() {
        return true;
    }
}
