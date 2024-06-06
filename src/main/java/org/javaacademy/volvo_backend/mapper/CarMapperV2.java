package org.javaacademy.volvo_backend.mapper;

import org.javaacademy.volvo_backend.repository.CarRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CarMapperV2 {
    @Autowired
    private CarRepository carRepository;
}
