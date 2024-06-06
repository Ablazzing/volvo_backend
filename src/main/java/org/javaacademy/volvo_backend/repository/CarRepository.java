package org.javaacademy.volvo_backend.repository;

import lombok.RequiredArgsConstructor;
import org.javaacademy.volvo_backend.entity.Car;
import org.javaacademy.volvo_backend.entity.Color;
import org.javaacademy.volvo_backend.entity.Country;
import org.javaacademy.volvo_backend.entity.Engine;
import org.javaacademy.volvo_backend.entity.Model;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CarRepository {
    private final JdbcTemplate jdbcTemplate;
    private final ColorRepository colorRepository;
    private final CountryRepository countryRepository;
    private final EngineRepository engineRepository;
    private final ModelRepository modelRepository;

    public Optional<Car> findById(Integer id) {
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet("select * from car where id = ?", id);
        if (!rowSet.next()) {
            return Optional.empty();
        }
        Car car = new Car();
        Color color = colorRepository.findById(rowSet.getInt("color_id")).orElseThrow();
        Country country = countryRepository.findById(rowSet.getInt("country_id")).orElseThrow();
        Engine engine = engineRepository.findById(rowSet.getInt("engine_id")).orElseThrow();
        Model model = modelRepository.findById(rowSet.getInt("model_id")).orElseThrow();
        car.setPrice(rowSet.getBigDecimal("price"));
        car.setVinNumber(rowSet.getString("vin_number"));
        car.setIsSold(rowSet.getBoolean("is_sold"));
        car.setProductionYear(rowSet.getInt("production_year"));
        car.setModel(model);
        car.setEngine(engine);
        car.setCountry(country);
        car.setColor(color);
        car.setId(rowSet.getInt("id"));
        return Optional.of(car);
    }
}
