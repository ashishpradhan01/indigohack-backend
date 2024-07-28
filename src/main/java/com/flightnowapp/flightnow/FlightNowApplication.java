package com.flightnowapp.flightnow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FlightNowApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightNowApplication.class, args);
	}

}
