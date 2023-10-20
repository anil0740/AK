package com.ak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ak.dao.ProductDao;
import com.ak.entity.Product;
import com.ak.repository.ProductRepository;

@Service
public class ProductService  implements ProductDao{
	@Autowired
	ProductRepository pr;
	public String addProduct(Product p) {
		pr.save(p);
		return "Product added";
	}
	public List<Product>getAllProducts(){
		return pr.findAll();
	}

}
