package com.example.kafkaproject.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.kafkaproject.model.Incident;

public interface IncidentService {
    Incident saveIncident(Incident incident);
    List<Incident> getAllIncidents();
    Optional<Incident> getIncidentById(UUID id);
    Optional<Incident> updateIncidentStatus(UUID id, String newStatus);
    boolean deleteIncident(UUID id);
}