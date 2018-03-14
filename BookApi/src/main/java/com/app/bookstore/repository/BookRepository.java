package com.app.bookstore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.bookstore.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

	public List<Book> findAllByName(@Param("name") String name);
		
	public Book findOneByName(String name);

}
