package com.example.redo.daoImplement;

import com.example.redo.dao.StudentDao;
import com.example.redo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements StudentDao {

    @Override
    public List<Student> getAllStudents() {

        return null;
    }

    @Override
    public Student save(Student student) {

        return null;
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student findByid(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
