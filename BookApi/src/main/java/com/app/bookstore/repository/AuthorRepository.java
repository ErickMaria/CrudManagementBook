package com.app.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.bookstore.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
	
	@Query("SELECT a FROM Author a WHERE a.name LIKE %?1")
	public List<Author> findByNameStartWith(@Param("name") String name);
	
	public Author findOneByName(String name);

}
