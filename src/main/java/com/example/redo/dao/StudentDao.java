package com.example.redo.dao;

import com.example.redo.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student save(Student student);
    Student update(Student student);
    Student findByid(Long id);
    void delete(Long id);

}
