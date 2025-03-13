package com.felipevenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipevenas.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
