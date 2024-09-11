package cz.unicorn.beerreviews.convert;

import cz.unicorn.beerreviews.client.dto.RandomBeer;
import cz.unicorn.beerreviews.endpoint.dto.BeerDTO;
import cz.unicorn.beerreviews.repo.dbo.BeerDBO;

public class BeerConverter {

	public static BeerDBO randomBeerToDBO(RandomBeer randomBeer) {
		BeerDBO beer = new BeerDBO();
		beer.setBrand(randomBeer.getBrand());
		beer.setName(randomBeer.getName());
		beer.setStyle(randomBeer.getStyle());
		beer.setHop(randomBeer.getHop());
		beer.setYeast(randomBeer.getYeast());
		beer.setMalts(randomBeer.getMalts());
		beer.setIbu(randomBeer.getIbu());
		beer.setAlcohol(randomBeer.getAlcohol());
		beer.setBlg(randomBeer.getBlg());
		return beer;
	}

	public static BeerDTO beerDBOtoDTO(BeerDBO dbo) {
		BeerDTO beer = new BeerDTO();
		beer.setId(dbo.getId().toHexString());
		beer.setBrand(dbo.getBrand());
		beer.setName(dbo.getName());
		beer.setStyle(dbo.getStyle());
		beer.setHop(dbo.getHop());
		beer.setYeast(dbo.getYeast());
		beer.setMalts(dbo.getMalts());
		beer.setIbu(dbo.getIbu());
		beer.setAlcohol(dbo.getAlcohol());
		beer.setBlg(dbo.getBlg());
		return beer;
	}
}
