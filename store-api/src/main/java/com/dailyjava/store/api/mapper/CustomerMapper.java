package com.dailyjava.store.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.dailyjava.store.api.dto.AddCustomerRequest;
import com.dailyjava.store.api.dto.CustomerResponse;
import com.dailyjava.store.api.dto.UpdateCustomerRequest;
import com.dailyjava.store.api.model.Customer;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CustomerMapper {

    Customer toCustomer(AddCustomerRequest addCustomerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

    void updateCustomerFromRequest(UpdateCustomerRequest updateCustomerRequest, @MappingTarget Customer customer);
}