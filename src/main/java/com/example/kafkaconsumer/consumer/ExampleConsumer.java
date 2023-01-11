package com.example.kafkaconsumer.consumer;

import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ExampleConsumer {
    @KafkaListener(topics = "dbserver1.outbox-demo.outbox_event")
    public void read(ConsumerRecord<String, GenericRecord> record){
        GenericRecord order=record.value();
        System.out.println(order.toString());
    }
}
