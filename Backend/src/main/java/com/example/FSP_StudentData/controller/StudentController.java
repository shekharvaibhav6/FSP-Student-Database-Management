package com.example.FSP_StudentData.controller;

import com.example.FSP_StudentData.entity.Student;
import com.example.FSP_StudentData.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5500/")
@RestController
@RequestMapping("api/std")
public class StudentController {
    @Autowired
    private StudentService service;
    @PostMapping("/save")
    public Student createStudent(@RequestBody Student student)
    {

        return service.saveStudent(student);
    }
    @GetMapping("/all")
    public List<Student> getAllStudents()
    {
        List<Student> allStudentData = service.getAllStudentData();
        return allStudentData;
    }

}


