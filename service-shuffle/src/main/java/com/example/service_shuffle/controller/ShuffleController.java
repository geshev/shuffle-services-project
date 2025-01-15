package com.example.service_shuffle.controller;

import com.example.service_shuffle.data.dto.ShuffleRequest;
import com.example.service_shuffle.service.ShuffleService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShuffleController {

    private final ShuffleService shuffleService;

    public ShuffleController(ShuffleService shuffleService) {
        this.shuffleService = shuffleService;
    }

    @PostMapping("shuffle")
    public ResponseEntity<Integer[]> shuffle(@RequestBody @Valid ShuffleRequest request) {
        return ResponseEntity.ok(shuffleService.shuffle(request));
    }
}
