package tp.weather.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tp.weather.domain.Weather;
import tp.weather.reository.WeatherRepository;

@Service
@Slf4j
public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;

	public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	@Override
	public Weather createWeather(Weather we) {
		return weatherRepository.save(we);
	}
}