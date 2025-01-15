package com.example.service_shuffle.data.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

public record ShuffleRequest(@Min(1) @Max(1000) int number) {
}
