package com.dailyjava.store.api.service;


import java.util.List;

import com.dailyjava.store.api.model.Order;

public interface OrderService {

    List<Order> getAllOrders();

    Order saveOrder(Order order);

    Order validateAndGetOrderById(String id);
}
