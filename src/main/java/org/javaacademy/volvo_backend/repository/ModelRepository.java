package org.javaacademy.volvo_backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.javaacademy.volvo_backend.entity.Model;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ModelRepository extends AbstractRepository<Model> {

    public ModelRepository(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        super(jdbcTemplate, objectMapper, Model.class);
    }
}
