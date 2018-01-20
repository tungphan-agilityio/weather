package tp.weather.reository;

import org.springframework.data.repository.CrudRepository;
import tp.weather.domain.Weather;

public interface WeatherRepository extends CrudRepository<Weather, Long> {
}