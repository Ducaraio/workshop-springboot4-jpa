package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	private final OrderRepository OrderRepository;

	OrderService(OrderRepository OrderRepository) {
		this.OrderRepository = OrderRepository;
	}
	
	public List<Order> findAll(){
		return OrderRepository.findAll();
	}
	
	public Order findbyId(Long id) {
		Optional<Order> obj = OrderRepository.findById(id);
		return obj.get();
	}
	
	
}
