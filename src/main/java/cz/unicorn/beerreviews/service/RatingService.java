package cz.unicorn.beerreviews.service;

import cz.unicorn.beerreviews.repo.RatingRepository;
import cz.unicorn.beerreviews.repo.dbo.RatingDBO;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepo;

	public List<RatingDBO> findRatings(String beerId, String userId) {
		return ratingRepo.findByBeerIdAndUserId(new ObjectId(beerId), new ObjectId(userId));
	}

	public void addRating(RatingDBO rating) {
		ratingRepo.insert(rating);
	}

	public void updateRating(RatingDBO rating) {
		ratingRepo.save(rating);
	}
}
