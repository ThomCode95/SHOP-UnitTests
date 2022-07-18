package mx.com.zara.prices.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import mx.com.zara.prices.entities.PricesEntity;
import mx.com.zara.prices.model.PricesResponse;
import mx.com.zara.prices.repository.PricesRepository;

class PricesServiceTest {
	
	/*
	 *Este test tiene de entrada tres parametros:
	 *String idProduct, 
	 *String idMarca,
	 *String aplicationDate
	 *
	 *De salida regresa un objeto tipo PricesResponse. Segun la documentacion que encontre en internet
	 *es mala idea hacer pruebas unitarias en metodos privados como convertEntity2DTO
	 */
	private static PricesResponse pricesResponse;
	private static PricesEntity pricesEntity;
	private static PricesService pricesService;
	
	@BeforeEach
	void setUp() {
		pricesEntity = new PricesEntity();
		pricesService = new PricesService();
		pricesService.pricesRepository = Mockito.mock(PricesRepository.class);
		
		
		//agregar valores para no la prueba que valida si es null
		pricesEntity.setPriceList(1);
		pricesEntity.setCurrency("EUR");
		pricesEntity.setEndDate(null);
		pricesEntity.setIdBrand(1);
		pricesEntity.setPrice(BigDecimal.valueOf(35.5));
		pricesEntity.setPriority(0);
		pricesEntity.setProductId(35455);
		pricesEntity.setStartDate(null);
	}
	
	@AfterEach
	void tearDown() {
		pricesEntity = null;
		pricesService = null;
		System.out.println("@AfterEach -> tearDown()");
	}

	
	@Test
	void testGetPricesByIdProductAndIdBrandAndApplicationDate() {
		when(pricesService.pricesRepository.findPricesByIdProductAndBrand(null, null, null)).thenReturn(pricesEntity);
		
		assertEquals(pricesResponse, pricesService.getPricesByIdProductAndIdBrandAndApplicationDate("", "", "") );
		
		//when(pricesService.pricesRepository.findPricesByIdProductAndBrand(null, null, null)).thenReturn(pricesEntity).then
	}
	
	
	@Test
	void testEntityIsNotNull() {
		//pricesEntity = new PricesEntity();
		assertNotNull(pricesEntity, "priceEntity no debe ser null");
	
	}
}
