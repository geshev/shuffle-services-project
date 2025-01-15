package com.example.service_log.service;

import com.example.service_log.data.dto.ShuffleLogRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class LogService {

    public void log(ShuffleLogRequest request) {
        System.out.println(new Timestamp(request.timestamp()) + " Requested shuffle for " + request.number()
                + ", shuffling took " + request.time() + "ms");
    }
}
