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

import com.dailyjava.store.api.dto.AddCustomerRequest;
import com.dailyjava.store.api.dto.CustomerResponse;
import com.dailyjava.store.api.dto.UpdateCustomerRequest;
import com.dailyjava.store.api.mapper.CustomerMapper;
import com.dailyjava.store.api.model.Customer;
import com.dailyjava.store.api.service.CustomerService;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;
    private final CustomerMapper customerMapper;

    @GetMapping
    public List<CustomerResponse> getAllCustomers() {
        return customerService.getAllCustomers()
                .stream()
                .map(customerMapper::toCustomerResponse)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CustomerResponse getCustomer(@PathVariable Long id) {
        Customer customer = customerService.validateAndGetCustomerById(id);
        return customerMapper.toCustomerResponse(customer);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public CustomerResponse addCustomer(@Valid @RequestBody AddCustomerRequest addCustomerRequest) {
        Customer customer = customerMapper.toCustomer(addCustomerRequest);
        customer = customerService.saveCustomer(customer);
        return customerMapper.toCustomerResponse(customer);
    }

    @PatchMapping("/{id}")
    public CustomerResponse updateCustomer(@PathVariable Long id, @Valid @RequestBody UpdateCustomerRequest updateCustomerRequest) {
        Customer customer = customerService.validateAndGetCustomerById(id);
        customerMapper.updateCustomerFromRequest(updateCustomerRequest, customer);
        customer = customerService.saveCustomer(customer);
        return customerMapper.toCustomerResponse(customer);
    }

    @DeleteMapping("/{id}")
    public CustomerResponse deleteCustomer(@PathVariable Long id) {
        Customer customer = customerService.validateAndGetCustomerById(id);
        customerService.deleteCustomer(customer);
        return customerMapper.toCustomerResponse(customer);
    }
}
