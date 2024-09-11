package cz.unicorn.beerreviews.repo.dbo;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndex(name = "beer_user", def = "{'beerId': 1, 'userId': 1")
public class RatingDBO {

	@Id
	private ObjectId id;
	private ObjectId beerId;
	private ObjectId userId;
	private Integer stars;
	private String comment;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public ObjectId getBeerId() {
		return beerId;
	}

	public void setBeerId(ObjectId beerId) {
		this.beerId = beerId;
	}

	public ObjectId getUserId() {
		return userId;
	}

	public void setUserId(ObjectId userId) {
		this.userId = userId;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}
