package com.app.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.bookstore.entity.Category;
import com.app.bookstore.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void save(Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> listAll(){
		return categoryRepository.findAll();
	}
	
	public List<Category> listAllByName(String name){
		return this.categoryRepository.findAllByName(name);
	}
	
	public Category findById(Long id) {
		return categoryRepository.findOne(id);
	}
	
	public Category findOneByName(String name) {
		return this.categoryRepository.findOneByName(name);
	}
	
	public void delete(Long id) {
		categoryRepository.delete(id);
	}
	
}
