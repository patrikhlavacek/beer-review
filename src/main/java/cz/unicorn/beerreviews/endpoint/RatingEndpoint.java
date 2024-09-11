package cz.unicorn.beerreviews.endpoint;

import cz.unicorn.beerreviews.endpoint.dto.RatingDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Endpoint managing beer ratings
 */
@RequestMapping("/ratings")
public interface RatingEndpoint {

	@GetMapping
	public List<RatingDTO> findRatings(@RequestParam String beerId, @RequestParam String userId);

	@PostMapping
	public void addRating(@RequestBody RatingDTO rating);

	@PutMapping
	public void updateRating(@RequestBody RatingDTO rating);
}
