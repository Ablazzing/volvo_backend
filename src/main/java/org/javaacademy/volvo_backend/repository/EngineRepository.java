package org.javaacademy.volvo_backend.repository;

import lombok.RequiredArgsConstructor;
import org.javaacademy.volvo_backend.entity.Engine;
import org.javaacademy.volvo_backend.entity.EngineType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EngineRepository {
    private final JdbcTemplate jdbcTemplate;
    private final EngineTypeRepository engineTypeRepository;

    public Optional<Engine> findById(Integer id) {
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("select * from engine where id = ?", id);
        if (!rowSet.next()) {
            return Optional.empty();
        };
        Engine engine = new Engine();
        Integer engineTypeId = rowSet.getInt("type_id");
        if (engineTypeId != 0 ) {
            EngineType engineType = engineTypeRepository.findById(engineTypeId).orElseThrow();
            engine.setEngineType(engineType);
        }
        engine.setId(rowSet.getInt("id"));
        engine.setPower(rowSet.getInt("power"));
        return Optional.of(engine);
    }
}
