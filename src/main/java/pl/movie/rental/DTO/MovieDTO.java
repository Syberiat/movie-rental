package pl.movie.rental.DTO;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDTO {

	private Long id;
	private String code;
	private String title;
	private String country;
	private String genre;
	private int price;
	private Boolean is_available;
	public List<RentPeriodDTO> rentPeriodList;
}
