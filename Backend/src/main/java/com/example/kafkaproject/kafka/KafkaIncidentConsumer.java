package com.example.kafkaproject.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaIncidentConsumer {

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "incident-group")
    public void listen(String message) {
        System.out.println("📥 Received Kafka message: " + message);
    }
}
