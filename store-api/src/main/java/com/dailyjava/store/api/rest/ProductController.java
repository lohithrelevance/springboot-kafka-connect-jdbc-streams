package com.dailyjava.store.api.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dailyjava.store.api.dto.AddProductRequest;
import com.dailyjava.store.api.dto.ProductResponse;
import com.dailyjava.store.api.dto.UpdateProductRequest;
import com.dailyjava.store.api.mapper.ProductMapper;
import com.dailyjava.store.api.model.Product;
import com.dailyjava.store.api.service.ProductService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @GetMapping
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts()
                .stream()
                .map(productMapper::toProductResponse)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        Product product = productService.validateAndGetProductById(id);
        return productMapper.toProductResponse(product);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ProductResponse addProduct(@Valid @RequestBody AddProductRequest addProductRequest) {
        Product product = productMapper.toProduct(addProductRequest);
        product = productService.saveProduct(product);
        return productMapper.toProductResponse(product);
    }

    @PatchMapping("/{id}")
    public ProductResponse updateProduct(@PathVariable Long id, @Valid @RequestBody UpdateProductRequest updateProductRequest) {
        Product product = productService.validateAndGetProductById(id);
        productMapper.updateProductFromRequest(updateProductRequest, product);
        product = productService.saveProduct(product);
        return productMapper.toProductResponse(product);
    }

    @DeleteMapping("/{id}")
    public ProductResponse deleteProduct(@PathVariable Long id) {
        Product product = productService.validateAndGetProductById(id);
        productService.deleteProduct(product);
        return productMapper.toProductResponse(product);
    }
}
