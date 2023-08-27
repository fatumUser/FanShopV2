package com.example.project_2.repositories.testRepo;

import com.example.project_2.entitys.testDB.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Long> {
    Student findByName(String name);
}
