package org.javaacademy.volvo_backend.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "color")
public class Color {
    private Integer id;
    private String name;
}
