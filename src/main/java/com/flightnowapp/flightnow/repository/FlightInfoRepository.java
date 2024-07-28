package com.flightnowapp.flightnow.repository;

import com.flightnowapp.flightnow.entity.FlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightInfoRepository extends JpaRepository<FlightInfo, Long> {
}
