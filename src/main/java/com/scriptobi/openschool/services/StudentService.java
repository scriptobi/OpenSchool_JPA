package com.scriptobi.openschool.services;

import com.scriptobi.openschool.models.StudentEntity;
import com.scriptobi.openschool.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service("StudentService")
public class StudentService {
    @Autowired
    StudentRepository studentRepo;

    public StudentEntity saveStudent(StudentEntity student) {
        return studentRepo.save(student);
    }

    public List<StudentEntity> findAll() { return studentRepo.findAll(); }
}
