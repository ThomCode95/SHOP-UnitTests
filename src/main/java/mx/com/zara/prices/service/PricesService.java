/**
 * 
 */
package mx.com.zara.prices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.zara.prices.entities.PricesEntity;
import mx.com.zara.prices.model.PricesResponse;
import mx.com.zara.prices.repository.PricesRepository;

/**
 * @author Danny
 *
 */
@Service
public class PricesService {

	@Autowired
	PricesRepository pricesRepository;

	/**
	 * getPricesByIdProductAndIdBrandAndApplicationDate
	 * 
	 * @param aplicationDate
	 * @param idMarca
	 * @param idProduct
	 */
	public PricesResponse getPricesByIdProductAndIdBrandAndApplicationDate(String idProduct, String idMarca,
			String aplicationDate) {

		PricesResponse pricesResponse = null;
		PricesEntity pricesEntity = pricesRepository.findPricesByIdProductAndBrand(aplicationDate, idMarca, idProduct);

		if (pricesEntity != null) {		
			pricesResponse = convertEntity2DTO(pricesEntity);
		} 

		return pricesResponse;
	}

	/**
	 * convertEntity2DTO
	 * @param pricesEntity
	 * @return
	 */
	private PricesResponse convertEntity2DTO(PricesEntity pricesEntity) {
		PricesResponse pricesResponse = new PricesResponse();

		try {
			pricesResponse.setFechaInicio(pricesEntity.getStartDate());
			pricesResponse.setFechaTermino(pricesEntity.getEndDate());
			pricesResponse.setIdMarca(pricesEntity.getIdBrand());
			pricesResponse.setIdProducto(pricesEntity.getProductId());
			pricesResponse.setPrecio(pricesEntity.getPrice());
			pricesResponse.setTarifa(pricesEntity.getPriceList());

		} catch (NullPointerException npe) {
			npe.getStackTrace();
		}
		return pricesResponse;
	}

}
