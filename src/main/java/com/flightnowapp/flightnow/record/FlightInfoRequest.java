package com.flightnowapp.flightnow.record;

import com.flightnowapp.flightnow.enums.FlightStatus;

import java.time.LocalDateTime;

public record FlightInfoRequest(
        String flightId,
        String airline,
        FlightStatus status,
        String departureGate,
        String arrivalGate,
        LocalDateTime scheduledDeparture,
        LocalDateTime scheduledArrival,
        LocalDateTime actualDeparture,
        LocalDateTime actualArrival
) {
}