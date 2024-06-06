package org.javaacademy.volvo_backend.dto;

import lombok.Data;

@Data
public class MarketingCarRecordDto {
    private String color;
    private String price;//формат - 35000 рублей
    private String power;//формат - 200 лошадей
    private String information; // страна производства + модель + год
    private String companyName;//Всегда Вольво
    private String vinNumber;
}
