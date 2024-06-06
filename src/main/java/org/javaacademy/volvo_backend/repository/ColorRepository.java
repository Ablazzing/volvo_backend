package org.javaacademy.volvo_backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.javaacademy.volvo_backend.entity.Color;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ColorRepository extends AbstractRepository<Color> {
    public ColorRepository(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        super(jdbcTemplate, objectMapper, Color.class);
    }
}
