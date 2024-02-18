package com.example.feign_client_weather_external.controller;

import com.example.feign_client_weather_external.model.WeatherApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @GetMapping("/weather")
    public WeatherApiResponse getWeather(
            @RequestParam(name = "lon") double longitude,
            @RequestParam(name = "lat") double latitude
    ) {
        return new WeatherApiResponse(LocalDateTime.now(),
                "Получен ответ от ms feign_client_weather_external. Сумма - "
                        .concat(String.valueOf(longitude + latitude)));
    }

}
