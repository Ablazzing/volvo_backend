package org.javaacademy.volvo_backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.javaacademy.volvo_backend.entity.EngineType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EngineTypeRepository extends AbstractRepository<EngineType> {
    public EngineTypeRepository(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        super(jdbcTemplate, objectMapper, EngineType.class);
    }
}
