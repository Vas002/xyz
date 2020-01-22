package com.example.service;

import com.example.model.Student;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.example.model.Student;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService
{
    @Cacheable("student")
    public Student getStudentById(int id)
    {


        Student s1=null;
        List<Student> s2= Arrays.asList(
            new Student(1,"Vishal","jnu"),
            new Student(2,"navneet","jamiya"),
            new Student(3,"mayuri","LNCT"),
            new Student(4,"sujaya","SRM"),
            new Student(5,"kush","VIT"));
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
            for(int i=0;i<s2.size();i++){
                if((s2.get(i).getId())==id)
                {
                    s1= s2.get(i);
                }
            }
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

       return s1;
    }

    }

