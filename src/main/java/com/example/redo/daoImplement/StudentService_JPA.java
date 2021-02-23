package com.example.redo.daoImplement;

import com.example.redo.dao.StudentRepo;
import com.example.redo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService_JPA  {

    @Autowired
    private StudentRepo studentRepo;

    public void addstudent(Student student){
        studentRepo.save(student);
    }

}
