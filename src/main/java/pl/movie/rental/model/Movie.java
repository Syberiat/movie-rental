package pl.movie.rental.model;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String code;
	private String title;
	private String country;
	private String genre;
	private int price;
	private Boolean is_available;

	@OneToMany(mappedBy = "movie", fetch = FetchType.LAZY)
	public List<RentPeriod> rentPeriodList;

}
