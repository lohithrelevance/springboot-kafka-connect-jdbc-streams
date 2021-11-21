package com.dailyjava.store.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyjava.store.api.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
