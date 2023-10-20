package com.ak.dao;

import java.util.List;

import com.ak.entity.Product;

public interface ProductDao {
	String addProduct(Product p);
	List<Product> getAllProducts();
}

