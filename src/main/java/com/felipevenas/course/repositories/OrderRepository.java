package com.felipevenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipevenas.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
		
}
