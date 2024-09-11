package cz.unicorn.beerreviews.repo;


import cz.unicorn.beerreviews.repo.dbo.BeerDBO;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BeerRepository extends MongoRepository<BeerDBO, ObjectId> {

}
