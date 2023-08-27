package com.example.project_2.repositories.testRepo;

import com.example.project_2.entitys.testDB.School;
import org.springframework.data.repository.CrudRepository;

public interface SchoolRepository extends CrudRepository<School, Integer> {
    SchoolRepository findByTitle(String title);
}
