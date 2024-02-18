package com.example.feign_client_weather_external.model;

import java.time.LocalDateTime;

public record WeatherApiResponse(LocalDateTime date, String value) {
}