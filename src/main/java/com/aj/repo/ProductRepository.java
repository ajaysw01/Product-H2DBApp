package com.aj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aj.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
