package org.javaacademy.volvo_backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.javaacademy.volvo_backend.entity.Country;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CountryRepository extends AbstractRepository<Country> {

    public CountryRepository(JdbcTemplate jdbcTemplate, ObjectMapper objectMapper) {
        super(jdbcTemplate, objectMapper, Country.class);
    }
}
