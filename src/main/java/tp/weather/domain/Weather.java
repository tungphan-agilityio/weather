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
public class Weather {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	private String location;
	private String iconText;
	private String temperature;
}
