package com.dailyjava.stream.serde.avro;

import com.dailyjava.stream.commons.storeapp.avro.OrderProduct;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class OrderProductAvroSerde extends SpecificAvroSerde<OrderProduct> {
}
