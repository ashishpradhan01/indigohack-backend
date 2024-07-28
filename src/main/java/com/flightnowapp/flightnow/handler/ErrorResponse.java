package com.flightnowapp.flightnow.handler;

import java.util.Map;

public record ErrorResponse(
    Map<String, String> errors
) {

}
