package com.flightnowapp.flightnow.constants;

public interface ApplicationConstant {
    String FLIGHT_STATUS = "/flight-status";
    String WEB_SOCKET_PATH = "/ws";
    String SPECIFIC_FLIGHT_PATH = "/specific";
    String ALL_FLIGHT_PATH = "/all";
    String ALL_FLIGHT_STATUS_PATH = ALL_FLIGHT_PATH + FLIGHT_STATUS;
    String SPECIFIC_FLIGHT_STATUS_PATH = SPECIFIC_FLIGHT_PATH + FLIGHT_STATUS;

}
