package com.nikhil.kitchenstory.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nikhil.kitchenstory.models.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
	
}
