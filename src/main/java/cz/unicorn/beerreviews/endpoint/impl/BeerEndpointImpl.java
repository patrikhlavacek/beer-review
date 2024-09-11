package cz.unicorn.beerreviews.endpoint.impl;

import cz.unicorn.beerreviews.convert.BeerConverter;
import cz.unicorn.beerreviews.endpoint.BeerEndpoint;
import cz.unicorn.beerreviews.endpoint.dto.BeerDTO;
import cz.unicorn.beerreviews.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class BeerEndpointImpl implements BeerEndpoint {

	@Autowired
	private BeerService beerService;

	@Override
	public List<BeerDTO> listBeers() {
		return beerService.findAllBeers().stream()
				.map(BeerConverter::beerDBOtoDTO)
				.toList();
	}

	@Override
	public BeerDTO getBeer(String id) {
		return beerService.findBeerById(id)
				.map(BeerConverter::beerDBOtoDTO)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Beer not found"));
	}
}
