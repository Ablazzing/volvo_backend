package org.javaacademy.volvo_backend.mapper;

import org.javaacademy.volvo_backend.dto.MarketingCarRecordDto;
import org.javaacademy.volvo_backend.dto.SupportCarRecordDto;
import org.javaacademy.volvo_backend.dto.TaxCarRecordDto;
import org.javaacademy.volvo_backend.entity.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring")
public interface CarMapper {

    @Mapping(target = "selfPrice", source = "model.selfPrice")
    @Mapping(target = "sellPrice", source = "price")
    TaxCarRecordDto convertToTaxDto(Car car);

    @Mapping(target = "engineType", source = "engine.engineType.name")
    @Mapping(target = "power", source = "engine.power")
    @Mapping(target = "model", source = "model.name")
    SupportCarRecordDto convertToSupportDto(Car car);

    @Mapping(target = "color", source = "color.name", nullValueCheckStrategy = NullValueCheckStrategy.ON_IMPLICIT_CONVERSION)
    @Mapping(target = "power", source = "engine.power")
    @Mapping(target = "information", source = ".", qualifiedByName = "getInformation")
    @Mapping(target = "companyName", expression = "java(\"Volvo\")")
    @Mapping(target = "vinNumber", ignore = true)
    MarketingCarRecordDto convertToMarketingDto(Car car);

    Car convertToEntity(Car car);

    @Named("getInformation")
    default String getInformation(Car car) {
        // страна производства + модель + год
        return "%s %s %s".formatted(
                car.getCountry().getName(),
                car.getModel().getName(),
                car.getProductionYear());
    }
}
