package com.example.service_shuffle.service;

import com.example.service_shuffle.data.dto.ShuffleLogRequest;
import com.example.service_shuffle.data.dto.ShuffleRequest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ShuffleService {

    private final LogService logService;

    public ShuffleService(LogService logService) {
        this.logService = logService;
    }

    public Integer[] shuffle(ShuffleRequest request) {
        long start = System.currentTimeMillis();
        List<Integer> list = IntStream.rangeClosed(1, request.number()).boxed().collect(Collectors.toList());
        Collections.shuffle(list);

        ShuffleLogRequest logRequest =
                new ShuffleLogRequest(start, request.number(), System.currentTimeMillis() - start);
        logService.sendLogRequest(logRequest);

        return list.toArray(new Integer[0]);
    }
}
