package cz.unicorn.beerreviews.service;

import cz.unicorn.beerreviews.client.RandomBeerClient;
import cz.unicorn.beerreviews.client.dto.RandomBeer;
import cz.unicorn.beerreviews.convert.BeerConverter;
import cz.unicorn.beerreviews.repo.BeerRepository;
import cz.unicorn.beerreviews.repo.dbo.BeerDBO;
import jakarta.annotation.PostConstruct;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeerService {

	@Autowired
	private RandomBeerClient beerClient;

	@Autowired
	private BeerRepository beerRepo;

	@PostConstruct
	private void initDB() {
		List<RandomBeer> randomBeers = beerClient.fetchRandomBeers();
		randomBeers.stream()
				.map(BeerConverter::randomBeerToDBO)
				.forEach(beerRepo::insert);
	}

	public List<BeerDBO> findAllBeers() {
		return beerRepo.findAll();
	}

	public Optional<BeerDBO> findBeerById(String id) {
		return beerRepo.findById(new ObjectId(id));
	}
}
