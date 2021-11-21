package com.dailyjava.store.api.dto;

import lombok.Data;

import java.util.List;

import com.dailyjava.store.api.model.OrderStatus;
import com.dailyjava.store.api.model.PaymentType;

@Data
public class OrderResponse {

    private String id;
    private Long customerId;
    private PaymentType paymentType;
    private OrderStatus status;
    private List<ProductResponse> products;

    @Data
    public static final class ProductResponse {
        private Long id;
        private Integer unit;
    }
}
