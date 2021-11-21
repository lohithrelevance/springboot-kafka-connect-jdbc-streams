package com.dailyjava.stream.serde.avro;

import com.dailyjava.stream.commons.storeapp.avro.Order;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class OrderAvroSerde extends SpecificAvroSerde<Order> {
}
