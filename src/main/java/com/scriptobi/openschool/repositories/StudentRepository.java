package com.scriptobi.openschool.repositories;

import com.scriptobi.openschool.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository  extends JpaRepository<StudentEntity, Integer> {
    public StudentEntity save(StudentEntity student);
}
