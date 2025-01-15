package com.example.service_log.controller;

import com.example.service_log.data.dto.ShuffleLogRequest;
import com.example.service_log.service.LogService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("log")
    public void log(@RequestBody ShuffleLogRequest request) {
        logService.log(request);
    }
}
