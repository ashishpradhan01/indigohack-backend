package com.flightnowapp.flightnow.scheduler;

import com.flightnowapp.flightnow.record.FlightInfoResponse;
import com.flightnowapp.flightnow.service.FlightInfoService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.flightnowapp.flightnow.constants.ApplicationConstant.ALL_FLIGHT_STATUS_PATH;

@Service
@AllArgsConstructor
@EnableAsync
public class FlightScheduler {
    private final FlightInfoService flightInfoService;
    private final SimpMessagingTemplate messagingTemplate;

//    @Async
    @Scheduled(fixedDelay = 10000, initialDelay = 20000)
    public void scheduleFixedDelayTask() {
        System.out.println("Message sending to socket...");
/*        FlightInfoResponse response = flightInfoService.updateRandomFlightStatus();
        messagingTemplate.convertAndSend(ALL_FLIGHT_STATUS_PATH, response);
        System.out.println("Message sent to socket and Airline: " + response.airline());*/
    }
}
