package com.app.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookstore.entity.Author;
import com.app.bookstore.service.AuthorService;

@RestController
@RequestMapping(value="/api/v1")
public class AuthorController {
	
	@Autowired
	private AuthorService service;
	
	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	public List<Author> authors(){
		return this.service.listAll();
	}
	
	@RequestMapping(value = "/authors", method = RequestMethod.POST)
	public void create (@RequestBody Author author) {
		this.service.save(author);
	}
	
	@RequestMapping(value = "/authors/{id}", method = RequestMethod.POST)
	public Author find(@PathVariable("id") Long id) {
		return this.service.findById(id);
		
	}
	
	@RequestMapping(value = "/authors/{name}", method = RequestMethod.GET)
	public List<Author> search(@PathVariable String name){
		System.out.println(name);
		return this.service.listAllByName(name);
	}
	
	@RequestMapping(value = "/authors", method = RequestMethod.PUT)
	public void update(@RequestBody Author author) {
		this.service.save(author);
	}
	
	@RequestMapping(value = "/authors/{îd}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		this.service.delete(id);
	}
	
}
