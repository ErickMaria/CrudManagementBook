package com.app.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookstore.entity.Book;
import com.app.bookstore.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public void save(Book book) {
		this.bookRepository.save(book);
	}
	
	public List<Book> listAll() {
		return this.bookRepository.findAll(); 
	}

	public List<Book> listAllByName(String name) {
		return this.bookRepository.findAllByName(name); 
	}
	
	public Book findOneById(Long id) {
		return this.bookRepository.findOne(id); 
	}
	
	public Book findOneByName(String name) {
		return this.bookRepository.findOneByName(name); 
	}
	
	public void delete(Long id) {
		this.bookRepository.delete(id);
	}
}
