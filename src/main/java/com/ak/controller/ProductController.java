package com.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.Product;
import com.ak.service.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	@Autowired
	private ProductService ps;
	@PostMapping("/")
	public String add(@RequestBody Product product) {
		return ps.addProduct(product);
	}
	@GetMapping("/")
		public List<Product> getAll(@RequestBody Product product){
			return ps.getAllProducts();
		}
	}

