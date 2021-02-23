package com.example.redo.controller;


import com.example.redo.daoImplement.StudentService;
import com.example.redo.daoImplement.StudentService_JPA;
import com.example.redo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService_JPA studentService_jpa;

    @RequestMapping(method = RequestMethod.POST,value = "/addstudent")
    public void addstudent(@RequestBody Student student) {
        studentService_jpa.addstudent(student);

    }

    public void getstudents() {

    }

    public void getstudentbyid() {

    }

    public void removestudent() {

    }

}
