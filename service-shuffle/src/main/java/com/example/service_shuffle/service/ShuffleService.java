package com.example.service_shuffle.service;

import com.example.service_shuffle.data.dto.ShuffleRequest;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ShuffleService {

    public Integer[] shuffle(ShuffleRequest request) {
        List<Integer> list = IntStream.rangeClosed(1, request.number()).boxed().collect(Collectors.toList());
        Collections.shuffle(list);
        return list.toArray(new Integer[0]);
    }
}
