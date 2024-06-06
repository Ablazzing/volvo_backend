package org.javaacademy.volvo_backend.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "engine")
public class Engine {
    private Integer id;
    private Integer power;
    private EngineType engineType;
}
