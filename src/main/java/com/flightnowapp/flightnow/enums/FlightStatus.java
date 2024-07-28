package com.flightnowapp.flightnow.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public enum FlightStatus {
    ON_TIME("On Time"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled");

    final String title;

    FlightStatus(String title) {
        this.title = title;
    }

    public static List<FlightStatus> getFlightStatusList() {
        return List.of(ON_TIME, DELAYED, CANCELLED);
    }

    @JsonValue
    public String getTitle() {
        return title;
    }
}