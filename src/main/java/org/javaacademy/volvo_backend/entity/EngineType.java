package org.javaacademy.volvo_backend.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "engine_type")
public class EngineType {
    private Integer id;
    private String name;
}
