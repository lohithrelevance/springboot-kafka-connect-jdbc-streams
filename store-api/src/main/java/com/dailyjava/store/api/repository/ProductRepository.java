package com.dailyjava.store.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyjava.store.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
