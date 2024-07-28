package com.flightnowapp.flightnow.mapper;

import com.flightnowapp.flightnow.entity.FlightInfo;
import com.flightnowapp.flightnow.record.FlightInfoResponse;
import org.springframework.stereotype.Service;

@Service
public class FlightInfoMapper {
    public FlightInfoResponse toFlightInfoResponse(FlightInfo flightInfo) {
        return new FlightInfoResponse(
                flightInfo.getFlightInfoId(),
                flightInfo.getFlightId(),
                flightInfo.getAirline(),
                flightInfo.getStatus(),
                flightInfo.getDepartureGate(),
                flightInfo.getArrivalGate(),
                flightInfo.getScheduledDeparture(),
                flightInfo.getScheduledArrival(),
                flightInfo.getActualDeparture(),
                flightInfo.getActualArrival()
        );
    }
}
