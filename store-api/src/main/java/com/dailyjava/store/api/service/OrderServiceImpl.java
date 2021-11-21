package com.dailyjava.store.api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.dailyjava.store.api.exception.OrderNotFoundException;
import com.dailyjava.store.api.model.Order;
import com.dailyjava.store.api.repository.OrderRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order validateAndGetOrderById(String id) {
        return orderRepository.findById(id).orElseThrow(() -> new OrderNotFoundException(id));
    }
}
