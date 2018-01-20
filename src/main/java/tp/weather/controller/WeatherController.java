package tp.weather.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tp.weather.domain.Weather;
import tp.weather.service.WeatherService;

@Slf4j
@RestController
@RequestMapping("/weathers")
public class WeatherController {

	private final WeatherService weatherService;

	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@GetMapping
	Weather getWeather() {
		Weather we = new Weather("Da Nang", "icon", "123^F");
		Weather w = weatherService.createWeather(we);
		log.info("Weather with id {} location {} and temperature {}", w.getId(), w.getLocation(), w.getTemperature());
		return w;
	}
}