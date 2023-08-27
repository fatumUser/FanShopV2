package com.example.project_2.repositories;

import com.example.project_2.entitys.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
