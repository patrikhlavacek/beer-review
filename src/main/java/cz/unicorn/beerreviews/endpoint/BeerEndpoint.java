package cz.unicorn.beerreviews.endpoint;

import cz.unicorn.beerreviews.endpoint.dto.BeerDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Endpoint managing beers
 */
@RequestMapping("/beers")
public interface BeerEndpoint {

	@GetMapping("/list")
	public List<BeerDTO> listBeers();

	@GetMapping("/{id}")
	public BeerDTO getBeer(@PathVariable("id") String id);

}
