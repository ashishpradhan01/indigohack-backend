package com.flightnowapp.flightnow.controller;

import com.flightnowapp.flightnow.record.FlightInfoRequest;
import com.flightnowapp.flightnow.record.FlightInfoResponse;
import com.flightnowapp.flightnow.service.FlightInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.flightnowapp.flightnow.constants.ApplicationConstant.ALL_FLIGHT_STATUS_PATH;

@RestController
@RequestMapping("/api/v1/flights")
@RequiredArgsConstructor
public class FlightInfoController {
    private final FlightInfoService flightInfoService;
    private final SimpMessagingTemplate messagingTemplate;

    @GetMapping
    public ResponseEntity<List<FlightInfoResponse>> getAllFlights() {
        return ResponseEntity.ok(flightInfoService.getAllFlights());
    }

    @GetMapping("/{flight-id}")
    public ResponseEntity<FlightInfoResponse> findFlightById(
            @PathVariable("flight-id") Long flightId
    ) {
        return ResponseEntity.ok(flightInfoService.findFlightById(flightId));
    }

    @PutMapping("/{flightId}")
    public ResponseEntity<FlightInfoRequest> updateFlight(@PathVariable Long flightId,
                                                           @RequestBody FlightInfoRequest updatedFlight) {
        // Update flight logic
        FlightInfoResponse flightInfoResponse = flightInfoService.updateFlight(flightId, updatedFlight);
        messagingTemplate.convertAndSend(ALL_FLIGHT_STATUS_PATH, updatedFlight);
        return ResponseEntity.ok(updatedFlight);
    }
}
