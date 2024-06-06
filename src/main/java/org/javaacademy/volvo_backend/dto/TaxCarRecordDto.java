package org.javaacademy.volvo_backend.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class TaxCarRecordDto {
    private BigDecimal sellPrice;//формат - 35000 рублей
    private BigDecimal selfPrice;//формат - 35000 рублей
    private Integer productionYear;
}
