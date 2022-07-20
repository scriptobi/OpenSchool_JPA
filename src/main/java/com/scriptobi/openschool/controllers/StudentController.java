package com.scriptobi.openschool.controllers;

import com.scriptobi.openschool.entities.CityEntity;
import com.scriptobi.openschool.entities.StudentEntity;
import com.scriptobi.openschool.services.CityService;
import com.scriptobi.openschool.services.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Resource(name = "StudentService")
    private StudentService studentService;
    @Resource(name = "CityService")
    private CityService cityService;

    @GetMapping(path = "")
    public List<StudentEntity> findAllStudents() {
        return studentService.findAll();
    }

    @PostMapping(path = "/new")
    public StudentEntity insertNewStudent(String firstname, String lastname, Date birthdate, Integer cpl) {
        CityEntity city = cityService.findById(cpl);
        StudentEntity student = new StudentEntity(firstname, lastname, birthdate, city);
        return studentService.saveStudent(student);
    }
}
