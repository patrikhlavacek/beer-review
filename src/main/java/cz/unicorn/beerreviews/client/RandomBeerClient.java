package cz.unicorn.beerreviews.client;

import cz.unicorn.beerreviews.client.dto.RandomBeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Client for interacting with random beer API.
 */
@Component
public class RandomBeerClient {

	@Value("${client.beerApi.url}")
	private String apiUrl;

	@Autowired
	private RestTemplate restTemplate;

	public List<RandomBeer> fetchRandomBeers() {
		String uri = UriComponentsBuilder.fromUriString(apiUrl)
				.queryParam("size", 100)
				.build().toUriString();

		ResponseEntity<List<RandomBeer>> responseEntity = restTemplate.exchange(
				uri,
				HttpMethod.GET,
				null,
				new ParameterizedTypeReference<>() {}
		);

		return responseEntity.getBody();
	}
}
