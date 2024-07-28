package com.flightnowapp.flightnow.service;

import com.flightnowapp.flightnow.entity.FlightInfo;
import com.flightnowapp.flightnow.enums.FlightStatus;
import com.flightnowapp.flightnow.mapper.FlightInfoMapper;
import com.flightnowapp.flightnow.record.FlightInfoRequest;
import com.flightnowapp.flightnow.record.FlightInfoResponse;
import com.flightnowapp.flightnow.repository.FlightInfoRepository;
import com.flightnowapp.flightnow.utils.RandomPickerUtil;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightInfoServiceImpl implements FlightInfoService{
    private final FlightInfoRepository flightInfoRepository;
    private final FlightInfoMapper mapper;

    @Override
    public FlightInfoResponse findFlightById(Long flightId) {
        return flightInfoRepository.findById(flightId)
                .map(mapper::toFlightInfoResponse)
                .orElseThrow(() -> new EntityNotFoundException("Flight not found with ID:: " + flightId));
    }

    @Override
    public List<FlightInfoResponse> getAllFlights() {
        return flightInfoRepository.findAll()
                .stream()
                .map(mapper::toFlightInfoResponse).toList();
    }

    @Override
    public FlightInfoResponse updateFlight(Long flightId, FlightInfoRequest updatedFlight) {
        FlightInfo flightInfo = flightInfoRepository.findById(flightId)
                .orElseThrow(() -> new EntityNotFoundException("Flight not found with ID:: " + flightId));

        if (updatedFlight.status() != null) {
            flightInfo.setStatus(updatedFlight.status());
        }
        return mapper.toFlightInfoResponse(flightInfoRepository.save(flightInfo));
    }

    @Override
    public FlightInfoResponse updateRandomFlightStatus() {
        List<FlightStatus> allStatus = FlightStatus.getFlightStatusList();
        List<FlightInfo> flightInfos = flightInfoRepository.findAll();
        FlightInfo flightInfo = RandomPickerUtil.randomPicker(flightInfos);
        FlightStatus newStatus = randomStatusPicker(allStatus, flightInfo.getStatus());
        flightInfo.setStatus(newStatus);
        return mapper.toFlightInfoResponse(flightInfoRepository.save(flightInfo));
    }

    private FlightStatus randomStatusPicker(List<FlightStatus> items, FlightStatus currentStatus) {
        while(true) {
            FlightStatus status = RandomPickerUtil.randomPicker(items);
            if (!currentStatus.equals(status)) return status;
        }
    }
}
