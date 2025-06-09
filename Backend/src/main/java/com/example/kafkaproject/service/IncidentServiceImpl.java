package com.example.kafkaproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kafkaproject.kafka.KafkaIncidentProducer;
import com.example.kafkaproject.model.Incident;
import com.example.kafkaproject.repository.IncidentRepository;

@Service
public class IncidentServiceImpl implements IncidentService {

    @Autowired
    private IncidentRepository incidentRepository;
    
    @Autowired
    private KafkaIncidentProducer kafkaIncidentProducer;
    @Override
    public Incident saveIncident(Incident incident) {
        Incident saved = incidentRepository.save(incident);
        kafkaIncidentProducer.sendIncident((saved));
        return saved;
    }

    @Override
    public List<Incident> getAllIncidents() {
        return incidentRepository.findAll();
    }

    @Override
    public Optional<Incident> getIncidentById(UUID id) {
        return incidentRepository.findById(id);
    }

    @Override
    public Optional<Incident> updateIncidentStatus(UUID id, String newStatus) {
        return incidentRepository.findById(id).map(incident -> {
            incident.setStatus(newStatus);
            return incidentRepository.save(incident);
        });
    }

    @Override
    public boolean deleteIncident(UUID id) {
        if (incidentRepository.existsById(id)) {
            incidentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
