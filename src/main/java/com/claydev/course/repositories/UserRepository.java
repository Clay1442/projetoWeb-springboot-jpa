package com.claydev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claydev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
