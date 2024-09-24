package com.challenge.challenge_API.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.lang.String.valueOf;

public class RestResponseEntityHandler {
    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj,
                                                          String tipo1, long nanoTime1) {
        double seconds = nanoTime1 / 1_000_000_000.0;

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("timestamp", LocalDateTime.now());
        map.put("message", message);
        map.put("status", status.value());
        map.put("data", responseObj);
        map.put("timeconsumed", tipo1.concat(valueOf(seconds)).concat(" segundos."));

        return new ResponseEntity<Object>(map, status);
    }

    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status, Object responseObj,
                                                          String tipo1, long nanoTime1, String tipo2, long nanoTime2) {

        double seconds1 = nanoTime1 / 1_000_000_000.0;
        double seconds2 = nanoTime2 / 1_000_000_000.0;

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("timestamp", LocalDateTime.now());
        map.put("message", message);
        map.put("status", status.value());
        map.put("data", responseObj);
        map.put("timeconsumed", tipo1.concat(valueOf(seconds1)).concat(" segundos").concat(" y ").concat(tipo2.concat(valueOf(seconds2)).concat(" segundos.")));

        return new ResponseEntity<Object>(map, status);
    }
}
