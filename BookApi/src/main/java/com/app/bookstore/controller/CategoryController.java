package com.app.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bookstore.entity.Category;
import com.app.bookstore.service.CategoryService;

@RestController
@RequestMapping(value="/api/v1")
public class CategoryController {
	
	@Autowired
	private CategoryService service;
	
	@RequestMapping(value="/categories", method = RequestMethod.GET)
	public List<Category> categories (){
		return this.service.listAll();
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.POST)
	public void create(@RequestBody Category category) {
		this.service.save(category);
	}
	
	@RequestMapping(value = "/categories/{id}", method = RequestMethod.POST)
	public Category find(@PathVariable("id") Long id) {
		return this.service.findById(id);
	}
	
	@RequestMapping(value = "/categories/{name}", method = RequestMethod.GET)
	public List<Category> search(@PathVariable("name") String name){
		return this.service.listAllByName(name);
	}
	
	@RequestMapping(value = "/categories", method = RequestMethod.PUT)
	public void update (@RequestBody Category category) {
		this.service.save(category);
	}
	
	@RequestMapping(value = "/categories/{id}", method = RequestMethod.DELETE)
	public void delete (@PathVariable("id") Long id) {
		this.service.delete(id);
	}
	
}
