package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository {

	void save(Product p);
	

}
