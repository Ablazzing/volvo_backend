package org.javaacademy.volvo_backend.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "car")
public class Car {
    private Integer id;
    private Model model;
    private Country country;
    private Color color;
    private BigDecimal price;
    private Engine engine;
    private String vinNumber;
    private Integer productionYear;
    private Boolean isSold;
}
