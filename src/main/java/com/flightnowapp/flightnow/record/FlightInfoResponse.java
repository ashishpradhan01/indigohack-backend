package com.flightnowapp.flightnow.record;

import com.flightnowapp.flightnow.enums.FlightStatus;

import java.time.LocalDateTime;

public record FlightInfoResponse(
        Long flightInfoId,
        String flightId,
        String airline,
        FlightStatus status,
        String departureGate,
        String arrivalGate,
        LocalDateTime scheduledDeparture,
        LocalDateTime scheduledArrival,
        LocalDateTime actualDeparture,
        LocalDateTime actualArrival
) {}