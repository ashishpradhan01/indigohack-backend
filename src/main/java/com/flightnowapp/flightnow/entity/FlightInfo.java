package com.flightnowapp.flightnow.entity;


import com.flightnowapp.flightnow.enums.FlightStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "flight_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_info_id")
    private Long flightInfoId;

    @Column(name = "flight_id", nullable = false, unique = true)
    private String flightId;

    @Column(name = "airline")
    private String airline;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private FlightStatus status;

    @Column(name = "departure_gate")
    private String departureGate;

    @Column(name = "arrival_gate")
    private String arrivalGate;

    @Column(name = "scheduled_departure")
    private LocalDateTime scheduledDeparture;

    @Column(name = "scheduled_arrival")
    private LocalDateTime scheduledArrival;

    @Column(name = "actual_departure")
    private LocalDateTime actualDeparture;

    @Column(name = "actual_arrival")
    private LocalDateTime actualArrival;
}