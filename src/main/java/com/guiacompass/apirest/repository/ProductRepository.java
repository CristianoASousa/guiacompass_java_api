package com.guiacompass.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guiacompass.apirest.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	Product findById(long id_product);
}
