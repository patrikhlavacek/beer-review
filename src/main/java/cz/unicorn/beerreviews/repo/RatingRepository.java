package cz.unicorn.beerreviews.repo;

import cz.unicorn.beerreviews.repo.dbo.RatingDBO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<RatingDBO, ObjectId> {

	public List<RatingDBO> findByBeerIdAndUserId(ObjectId beerId, ObjectId userId);
}
