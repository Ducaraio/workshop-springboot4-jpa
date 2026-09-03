package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	private final ProductRepository ProductRepository;

	ProductService(ProductRepository ProductRepository) {
		this.ProductRepository = ProductRepository;
	}
	
	public List<Product> findAll(){
		return ProductRepository.findAll();
	}
	
	public Product findbyId(Long id) {
		Optional<Product> obj = ProductRepository.findById(id);
		return obj.get();
	}
	
	
}
