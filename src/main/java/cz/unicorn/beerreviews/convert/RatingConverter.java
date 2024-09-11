package cz.unicorn.beerreviews.convert;

import cz.unicorn.beerreviews.endpoint.dto.RatingDTO;
import cz.unicorn.beerreviews.repo.dbo.RatingDBO;
import org.bson.types.ObjectId;

public class RatingConverter {

	public static RatingDTO ratingDBOtoDTO(RatingDBO dbo) {
		RatingDTO dto = new RatingDTO();
		dto.setId(dbo.getId().toHexString());
		dto.setBeerId(dbo.getBeerId().toHexString());
		dto.setUserId(dbo.getUserId().toHexString());
		dto.setStars(dbo.getStars());
		dto.setComment(dbo.getComment());
		return dto;
	}

	public static RatingDBO ratingDTOtoDBO(RatingDTO dto) {
		RatingDBO dbo = new RatingDBO();
		dbo.setId(dto.getId() != null ? new ObjectId(dto.getId()) : null);
		dbo.setBeerId(new ObjectId(dto.getBeerId()));
		dbo.setUserId(new ObjectId(dto.getUserId()));
		dbo.setStars(dto.getStars());
		dbo.setComment(dto.getComment());
		return dbo;
	}
}
