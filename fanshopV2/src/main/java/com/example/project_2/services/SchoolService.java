package com.example.project_2.services;

import com.example.project_2.entitys.testDB.Director;
import com.example.project_2.entitys.testDB.School;
import com.example.project_2.entitys.testDB.Student;
import com.example.project_2.repositories.testRepo.DirectorRepo;
import com.example.project_2.repositories.testRepo.SchoolRepository;
import com.example.project_2.repositories.testRepo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    @Autowired
    private SchoolRepository schoolRepository;
    @Autowired
    private DirectorRepo directorRepo;
    @Autowired
    private StudentRepo studentRepo;

    public SchoolService () {
    }

    @Autowired
    public SchoolService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void AddSchool() {
        Student student1 = new Student();
        student1.setName("Dima");
        student1.setAge(15);
        Student student2 = new Student();
        student2.setName("Alex");
        student2.setAge(18);
        Student student3 = new Student();
        student3.setName("Zaur");
        student3.setAge(25);
        Student student4 = new Student();
        student4.setName("Sany");
        student4.setAge(16);

        Director director1 = new Director();
        director1.setName("Aleks");
        director1.setAge(31);
        director1.setMany(20000);
        Director director2 = new Director();
        director2.setName("Dmitriy");
        director2.setAge(20);
        director2.setMany(1800000);

        studentRepo.save(student1);
        studentRepo.save(student2);
        studentRepo.save(student3);
        studentRepo.save(student4);
        directorRepo.save(director1);
        directorRepo.save(director2);

        School school = new School();
        school.setTitle("School 5");
        school.addStudent(student1);
        school.addStudent(student2);
        school.setDirector(director1);
        schoolRepository.save(school);

        School school2 = new School();
        school2.setTitle("School 9");
        school2.addStudent(student3);
        school2.addStudent(student4);
        school2.setDirector(director2);
        schoolRepository.save(school2);

        Iterable<School> schools = schoolRepository.findAll();

        for (School school1 : schools) {
            String name = school1.getDirector().getName();
            int age = school1.getDirector().getAge();
            int many = school1.getDirector().getMany();
            System.out.println(name + "\n" + age + "\n" + many);
            for (Student student: school1.getStudents()) {
                String name1 = student.getName();
                int age1 = student.getAge();
                System.out.println(name1 + "\n" + age1);
            }
        }
    }

}
