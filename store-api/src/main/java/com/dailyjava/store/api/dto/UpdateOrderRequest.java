package com.dailyjava.store.api.dto;

import com.dailyjava.store.api.model.OrderStatus;
import com.dailyjava.store.api.model.PaymentType;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UpdateOrderRequest {

    @Schema(example = "CASH")
    private PaymentType paymentType;

    @Schema(example = "PAYED")
    private OrderStatus status;
}
