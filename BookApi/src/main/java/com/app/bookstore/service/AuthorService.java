package com.app.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookstore.entity.Author;
import com.app.bookstore.repository.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public void save(Author author) {
		authorRepository.save(author);
	}
	
	public List<Author> listAll(){
		return authorRepository.findAll();
	}
	
	public List<Author> listAllByName(String name) {
		return this.authorRepository.findByNameStart
				
				With(name);
	}
	
	public Author findById(Long id) {
		return authorRepository.findOne(id);
	}
	
	public Author findOneByName(String name) {
		return this.authorRepository.findOneByName(name);
	}
	
	public void delete(Long id) {
		authorRepository.delete(id);
	}
}
