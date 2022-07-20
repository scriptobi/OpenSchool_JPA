package com.scriptobi.openschool.controllers;

import com.scriptobi.openschool.entities.StudentEntity;
import com.scriptobi.openschool.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Resource(name = "StudentService")
    private StudentService studentService;

    @GetMapping(path = "/")
    public List<StudentEntity> findAllStudents() {
        return studentService.findAll();
    }
}
