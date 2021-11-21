package com.dailyjava.stream.serde.json;

import org.springframework.kafka.support.serializer.JsonSerde;

import com.dailyjava.stream.commons.storeapp.json.OrderProduct;

public class OrderProductJsonSerde extends JsonSerde<OrderProduct> {
}
