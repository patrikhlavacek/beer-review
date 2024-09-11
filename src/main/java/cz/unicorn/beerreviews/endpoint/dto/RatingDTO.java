package cz.unicorn.beerreviews.endpoint.dto;

public class RatingDTO {

	private String id;
	private String beerId;
	private String userId;
	private Integer stars;
	private String comment;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBeerId() {
		return beerId;
	}

	public void setBeerId(String beerId) {
		this.beerId = beerId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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
