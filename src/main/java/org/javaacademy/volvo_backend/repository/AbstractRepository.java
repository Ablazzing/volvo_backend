package org.javaacademy.volvo_backend.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class AbstractRepository <T> {
    private final JdbcTemplate jdbcTemplate;
    private final ObjectMapper objectMapper;
    private final Class<T> tClass;

    public Optional<T> findById(Integer id) {
        String tableName = tClass.getDeclaredAnnotation(Table.class).name();
        String sql = """
                select * from %s where id = ?
                """.formatted(tableName);
        Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
        return Optional.ofNullable(objectMapper.convertValue(map, tClass));
    }
}
