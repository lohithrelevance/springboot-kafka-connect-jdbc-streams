package com.dailyjava.stream.serde.avro;

import com.dailyjava.stream.commons.storeapp.avro.Product;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class ProductAvroSerde extends SpecificAvroSerde<Product> {
}
