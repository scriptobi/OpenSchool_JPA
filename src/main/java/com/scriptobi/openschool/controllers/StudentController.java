package com.scriptobi.openschool.controllers;

import com.scriptobi.openschool.models.StudentEntity;
import com.scriptobi.openschool.services.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    @Resource(name = "StudentService")
    private StudentService studentService;

    @GetMapping(path = "")
    public List<StudentEntity> findAllStudents() {
        return studentService.findAll();
    }

    @GetMapping(path = "/{matricule}")
    public StudentEntity findById(String matricule) { return studentService.findById(matricule).get(); }

    @PostMapping(path = "/new")
    public StudentEntity save(String matricule, String firstName, String lastName, String birthdate, String city) {
        Timestamp birthDate = Timestamp.valueOf(birthdate);
        return studentService.saveStudent(new StudentEntity(matricule, firstName, lastName, birthDate, city));
    }
}
