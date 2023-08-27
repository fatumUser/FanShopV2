package com.example.project_2.entitys.testDB;

import jakarta.persistence.*;
import org.hibernate.query.sqm.mutation.internal.temptable.AfterUseAction;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int age;
    private int many;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMany() {
        return many;
    }

    public void setMany(int many) {
        this.many = many;
    }
}
