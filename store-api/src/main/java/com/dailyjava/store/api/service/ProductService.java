package com.dailyjava.store.api.service;


import java.util.List;

import com.dailyjava.store.api.model.Product;

public interface ProductService {

    List<Product> getAllProducts();

    Product saveProduct(Product product);

    void deleteProduct(Product product);

    Product validateAndGetProductById(Long id);
}
