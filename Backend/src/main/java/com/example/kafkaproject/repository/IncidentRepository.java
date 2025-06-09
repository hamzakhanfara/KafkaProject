package com.example.kafkaproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kafkaproject.model.Incident;

@Repository
public interface IncidentRepository extends JpaRepository<Incident, UUID> { }

