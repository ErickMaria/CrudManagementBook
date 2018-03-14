package com.app.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookstore.entity.Book;
import com.app.bookstore.service.BookService;

@RestController
@RequestMapping(value = "/api/v1")
public class BookController {
	
	@Autowired
	private BookService service; 
	
	
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<Book> books(){		
		return service.listAll();
	}
	
	@RequestMapping(value = "/books", method = RequestMethod.POST)
	public void create(@RequestBody Book book) {
		this.service.save(book);
	}
	@RequestMapping(value = "/books/{id}", method = RequestMethod.POST)
	public Book find(@PathVariable("id") Long id) {
		return this.service.findOneById(id);
	}
	
	@RequestMapping(value = "books/{name}", method = RequestMethod.GET)
	public List<Book> search(@PathVariable("name") String name) {
		return this.service.listAllByName(name);
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public void update(@PathVariable("id") Long id, @RequestBody Book book) {
		
		if(this.service.findOneById(id) != null) {
			this.service.save(book);
		}
	}
	
	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void delele(@PathVariable("id") Long id) {
		this.service.delete(id);
	}
	
}
