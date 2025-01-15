package com.example.service_shuffle.service;

import com.example.service_shuffle.data.dto.ShuffleLogRequest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LogService {

    private final RestTemplate rest;

    public LogService(RestTemplate rest) {
        this.rest = rest;
    }

    @Async
    public void sendLogRequest(ShuffleLogRequest logRequest) {
        rest.postForObject("log", logRequest, Void.class);
    }
}
