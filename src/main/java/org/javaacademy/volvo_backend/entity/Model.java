package org.javaacademy.volvo_backend.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Data
@Table(name = "model")
public class Model {
    private Integer id;
    private String name;
    private BigDecimal selfPrice;
}
