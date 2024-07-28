package com.flightnowapp.flightnow.service;

import com.flightnowapp.flightnow.record.FlightInfoRequest;
import com.flightnowapp.flightnow.record.FlightInfoResponse;

import java.util.List;

public interface FlightInfoService {
    FlightInfoResponse findFlightById(Long flightId);

    List<FlightInfoResponse> getAllFlights();

    FlightInfoResponse updateFlight(Long flightId, FlightInfoRequest updatedFlight);

    FlightInfoResponse updateRandomFlightStatus();
}
