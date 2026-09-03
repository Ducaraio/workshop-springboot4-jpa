package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Category;
import com.example.demo.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	private final CategoryRepository CategoryRepository;

	CategoryService(CategoryRepository CategoryRepository) {
		this.CategoryRepository = CategoryRepository;
	}
	
	public List<Category> findAll(){
		return CategoryRepository.findAll();
	}
	
	public Category findbyId(Long id) {
		Optional<Category> obj = CategoryRepository.findById(id);
		return obj.get();
	}
	
	
}
