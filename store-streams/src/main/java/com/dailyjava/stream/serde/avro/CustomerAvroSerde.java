package com.dailyjava.stream.serde.avro;

import com.dailyjava.stream.commons.storeapp.avro.Customer;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class CustomerAvroSerde extends SpecificAvroSerde<Customer> {
}
