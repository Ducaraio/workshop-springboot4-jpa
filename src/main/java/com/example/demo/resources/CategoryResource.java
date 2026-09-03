package com.example.demo.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Category;
import com.example.demo.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	private CategoryService service;
	
	public CategoryResource(CategoryService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> Categorys = service.findAll();
		return ResponseEntity.ok().body(Categorys);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category obj = service.findbyId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
