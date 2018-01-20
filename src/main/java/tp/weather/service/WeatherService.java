package tp.weather.service;

import tp.weather.domain.Weather;

public interface WeatherService {
	/**
	 * Creates a {@link Weather} object.
	 */
	Weather createWeather(Weather we);
}