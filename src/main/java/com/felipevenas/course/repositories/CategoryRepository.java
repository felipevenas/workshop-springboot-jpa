package com.felipevenas.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipevenas.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

		
}
