package com.claydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claydev.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
