package org.javaacademy.volvo_backend.controller;

import lombok.RequiredArgsConstructor;
import org.javaacademy.volvo_backend.dto.MarketingCarRecordDto;
import org.javaacademy.volvo_backend.dto.SupportCarRecordDto;
import org.javaacademy.volvo_backend.dto.TaxCarRecordDto;
import org.javaacademy.volvo_backend.entity.Car;
import org.javaacademy.volvo_backend.mapper.CarMapper;
import org.javaacademy.volvo_backend.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarService {
    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public TaxCarRecordDto getCarForTax(Integer carId) {
        Car car = carRepository.findById(carId).orElseThrow();
        return carMapper.convertToTaxDto(car);
    }

    public MarketingCarRecordDto getMarketingCar(Integer carId) {
        Car car = carRepository.findById(carId).orElseThrow();
        return carMapper.convertToMarketingDto(car);
    }

    public SupportCarRecordDto getSupportCar(Integer carId) {
        Car car = carRepository.findById(carId).orElseThrow();
        return carMapper.convertToSupportDto(car);
    }

}
