package com.example.kafkaproject.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.kafkaproject.model.Incident;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaIncidentProducer {

    @Value("${app.kafka.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void sendIncident(Incident incident) {
        try {
            String message = objectMapper.writeValueAsString(incident);
            kafkaTemplate.send(topic, message);
            System.out.println("✅ Incident sent to Kafka: " + message);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
