package tp.weather.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
@Entity
public final class Weather {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private final Long id;

	@Column(name = "location")
	private final String location;

	@Column(name = "iconText")
	private final String iconText;

	@Column(name = "temperature")
	private final String temperature;

	public Weather() {
		this(null, null, null, null);
	}

	public Weather(String location, String iconText, String temperature) {
		this(null, location, iconText, temperature);

	}
}
