package com.example.kafkaproject.model;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "incident")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Incident {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "status", nullable = false)
    private String status = "en_cours";

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;
}
