package mx.com.zara.prices.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestParam;

import mx.com.zara.prices.entities.PricesEntity;
import mx.com.zara.prices.model.PricesResponse;
import mx.com.zara.prices.repository.PricesRepository;
import mx.com.zara.prices.service.PricesService;


/*
 * En esta clase se valida que el controlador llame a la funcion que da un response
 * URI: "/prices"
 * Inputs: 			
 * 			@RequestParam String idProduct, 
			@RequestParam String idMarca, 
			@RequestParam String aplicationDate
 * 
 * Outputs:
 * 		objeto pricesResponse, 
 * 		HttpStatus.OK 
 */
@WebMvcTest(value = PricesController.class)
class PricesControllerTest {
	
	//private MockMvc mockMvc;
	
	@InjectMocks
	private static PricesController pricesController;
	private static PricesResponse pricesResponse;
	private static PricesService pricesService;
	
	private ResponseEntity<PricesResponse> pricesR;
	
	@BeforeEach
	void setUp() {
		
		//mockMvc = MockMvcBuilders.standaloneSetup(pricesController).build();
		
		pricesResponse = new PricesResponse();
		pricesService = new PricesService();
		pricesController = new PricesController();
		pricesR = new ResponseEntity<>(pricesResponse, HttpStatus.OK);
		pricesController.pricesService = Mockito.mock(pricesService.getClass());
	}
	@AfterEach
	void tearDown() {
		pricesResponse = null;
		pricesService = null;
		pricesController = null;
		pricesR = null;
	}
	
	
	@Test
	void testGetPricesByIdProductAndIdBrandAndApplicationDate(){
		when(pricesController.pricesService.getPricesByIdProductAndIdBrandAndApplicationDate("", "", "")).thenReturn(pricesResponse);
	
		assertEquals(pricesR, pricesController.getPricesByIdProductAndIdBrandAndApplicationDate("", "", ""));
	}
	
	//@Test
	//void testController() throws Exception{
		
		//mockMvc.perform(MockMvcRequestBuilders.get("/prices")
			//	.accept(MediaType.APPLICATION_JSON))
				//.andExpect(status().isOk())
				//.andExpect(content()
				//.contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
//;
		
	//}
	
	
	//@Test
	//void testGetPricesByIdProductAndIdBrandAndApplicationDate(){
		
		//mockMvc.perform(MockMvcRequestBuilders.get("/prices")
			//	.accept(MediaType.APPLICATION_JSON))
				//.andExpect(status().isOk())
				//.andExpect(content()
	//					.contentTypeCompatibleWith(MediaType.APPLICATION_JSON));

		//when(pricesController.getPricesByIdProductAndIdBrandAndApplicationDate(null, null, null)).thenReturn(pricesR);
		//assertEquals(pricesR, pricesController.getPricesByIdProductAndIdBrandAndApplicationDate("", "", "") );
		
		//mockMvc.perform(
			//	MockMvcRequestBuilders.get("/prices")
				//)
		//.andExpect(MockMvcResultMatchers.status().isOk());
		
	//}

}
