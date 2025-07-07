package com.claydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claydev.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
