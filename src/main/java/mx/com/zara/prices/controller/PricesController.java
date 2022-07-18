/**
 * 
 */
package mx.com.zara.prices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.zara.prices.model.PricesResponse;
import mx.com.zara.prices.service.PricesService;

/**
 * @author Danny
 *
 */
@RestController
public class PricesController {

	@Autowired
	PricesService pricesService;

	/**
	 * get Prices By IdProduct And IdBrand And ApplicationDate
	 * 
	 * @param idProduct
	 * @param idMarca
	 * @param AplicationDate
	 */
	@GetMapping("/prices")
	public ResponseEntity<PricesResponse> getPricesByIdProductAndIdBrandAndApplicationDate(
			@RequestParam String idProduct, 
			@RequestParam String idMarca, 
			@RequestParam String aplicationDate) {

		PricesResponse pricesResponse = pricesService.getPricesByIdProductAndIdBrandAndApplicationDate(idProduct,
				idMarca, aplicationDate);

		return new ResponseEntity<>(pricesResponse, HttpStatus.OK);
	}

}
