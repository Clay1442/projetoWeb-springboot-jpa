package com.claydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claydev.course.entities.OrderItem;
import com.claydev.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
