package com.dailyjava.store.api.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class OrderProductPk implements Serializable {

    private String order;
    private Long product;
}
