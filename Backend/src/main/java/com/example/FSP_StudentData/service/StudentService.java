package com.example.FSP_StudentData.service;

import com.example.FSP_StudentData.entity.Student;
import com.example.FSP_StudentData.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student) {

        return studentRepo.save(student);
    }
    public List<Student> getAllStudentData() {

        return studentRepo.findAll();
    }

}
