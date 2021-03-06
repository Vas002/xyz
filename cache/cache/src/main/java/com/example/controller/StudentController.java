package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Student;
import com.example.service.StudentService;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController
{


    @Autowired
    StudentService studentService;



    @GetMapping("/student/{id}")
    public Student findStudentById(@PathVariable int id)
    {
        System.out.println("Searching by ID  : " + id);

        return studentService.getStudentById(id);
    }
}