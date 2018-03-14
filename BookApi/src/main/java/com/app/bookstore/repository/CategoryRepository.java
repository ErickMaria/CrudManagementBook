package com.app.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.bookstore.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

	public List<Category> findAllByName(@Param("name") String name);
	
	public Category findOneByName(String name);
	
}
