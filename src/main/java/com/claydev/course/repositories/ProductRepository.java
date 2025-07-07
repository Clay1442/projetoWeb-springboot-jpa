package com.claydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claydev.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
