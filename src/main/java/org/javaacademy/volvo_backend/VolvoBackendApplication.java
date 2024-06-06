package org.javaacademy.volvo_backend;

import org.javaacademy.volvo_backend.entity.Country;
import org.javaacademy.volvo_backend.repository.CarRepository;
import org.javaacademy.volvo_backend.repository.CountryRepository;
import org.javaacademy.volvo_backend.repository.EngineRepository;
import org.javaacademy.volvo_backend.repository.ModelRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VolvoBackendApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VolvoBackendApplication.class, args);
		CountryRepository countryRepository = context.getBean(CountryRepository.class);
		Country country = countryRepository.findById(1).orElseThrow();
		//System.out.println(country);

		ModelRepository modelRepository = context.getBean(ModelRepository.class);
		//System.out.println(modelRepository.findById(1));

		EngineRepository engineRepository = context.getBean(EngineRepository.class);
		//System.out.println(engineRepository.findById(1).orElseThrow());
		CarRepository carRepository = context.getBean(CarRepository.class);
		System.out.println(carRepository.findById(1).orElseThrow());
	}

}
