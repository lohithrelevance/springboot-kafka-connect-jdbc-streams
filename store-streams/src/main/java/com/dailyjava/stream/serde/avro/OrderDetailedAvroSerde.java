package com.dailyjava.stream.serde.avro;

import com.dailyjava.stream.commons.storeapp.avro.OrderDetailed;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class OrderDetailedAvroSerde extends SpecificAvroSerde<OrderDetailed> {
}
