package org.javaacademy.volvo_backend.dto;

import lombok.Data;

@Data
public class SupportCarRecordDto {
    private String vinNumber;
    private String engineType;
    private String power;
    private String model;
    private Integer productionYear;
}
