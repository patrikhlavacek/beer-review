package cz.unicorn.beerreviews.endpoint.impl;

import cz.unicorn.beerreviews.convert.RatingConverter;
import cz.unicorn.beerreviews.endpoint.RatingEndpoint;
import cz.unicorn.beerreviews.endpoint.dto.RatingDTO;
import cz.unicorn.beerreviews.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingEndpointImpl implements RatingEndpoint {

	@Autowired
	private RatingService ratingService;

	@Override
	public List<RatingDTO> findRatings(String beerId, String userId) {
		return ratingService.findRatings(beerId, userId).stream()
				.map(RatingConverter::ratingDBOtoDTO)
				.toList();
	}

	@Override
	public void addRating(RatingDTO rating) {
		ratingService.addRating(RatingConverter.ratingDTOtoDBO(rating));
	}

	@Override
	public void updateRating(RatingDTO rating) {
		ratingService.updateRating(RatingConverter.ratingDTOtoDBO(rating));
	}
}
