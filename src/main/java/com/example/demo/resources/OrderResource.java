package com.example.demo.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	private OrderService service;
	
	public OrderResource(OrderService service) {
		this.service = service;
	}
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> Orders = service.findAll();
		return ResponseEntity.ok().body(Orders);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findbyId(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
