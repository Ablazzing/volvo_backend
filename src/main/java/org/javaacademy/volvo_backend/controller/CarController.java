package org.javaacademy.volvo_backend.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.volvo_backend.dto.MarketingCarRecordDto;
import org.javaacademy.volvo_backend.dto.SupportCarRecordDto;
import org.javaacademy.volvo_backend.dto.TaxCarRecordDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @GetMapping("/tax/{carId}")
    public TaxCarRecordDto getCarForTax(@PathVariable Integer carId) {
        return carService.getCarForTax(carId);
    }

    @GetMapping("/support/{carId}")
    public SupportCarRecordDto getCarForSupport(@PathVariable Integer carId) {
        return carService.getSupportCar(carId);
    }

    @GetMapping("/marketing/{carId}")
    public MarketingCarRecordDto getAllCarsForMarketing(@PathVariable Integer carId) {
        return carService.getMarketingCar(carId);
    }
}
