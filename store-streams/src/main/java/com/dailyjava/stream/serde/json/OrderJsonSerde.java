package com.dailyjava.stream.serde.json;

import org.springframework.kafka.support.serializer.JsonSerde;

import com.dailyjava.stream.commons.storeapp.json.Order;

public class OrderJsonSerde extends JsonSerde<Order> {
}
