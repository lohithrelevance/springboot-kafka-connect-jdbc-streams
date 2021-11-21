package com.dailyjava.store.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.dailyjava.store.api.dto.AddProductRequest;
import com.dailyjava.store.api.dto.ProductResponse;
import com.dailyjava.store.api.dto.UpdateProductRequest;
import com.dailyjava.store.api.model.Product;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface ProductMapper {

    Product toProduct(AddProductRequest addProductRequest);

    ProductResponse toProductResponse(Product product);

    void updateProductFromRequest(UpdateProductRequest updateProductRequest, @MappingTarget Product product);
}