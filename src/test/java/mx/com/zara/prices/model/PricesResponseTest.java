package mx.com.zara.prices.model;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

import mx.com.zara.prices.entities.PricesEntity;


class PricesResponseTest {

	
	private static PricesResponse pricesResponse;
	private static BeanTester tester;
	
	//Antes de correr cada test creara el objeto
	@BeforeEach
	public void setUp() {
		pricesResponse = new PricesResponse();
		tester = new BeanTester();
		tester.testBean(PricesEntity.class);
		System.out.println("@BeforeEach -> setUp()");
	}
	
	//Despues de correr cada test borrara cada objeto para hacer limpieza de memoria
	@AfterEach
	public void tearDown() {
		pricesResponse = null;
		tester = null;
		System.out.println("@AfterEach -> tearDown()");
	}
	
		
		
	@Test
	void testGetIdProducto() {
		pricesResponse.setIdProducto(35455);
		assertEquals(35455, pricesResponse.getIdProducto());
	}

	@Test
	void testSetIdProducto() {
		pricesResponse.setIdProducto(35455);
		assertEquals(35455, pricesResponse.getIdProducto());
	}

	@Test
	void testGetIdMarca() {
		pricesResponse.setIdMarca(1);
		assertEquals(1, pricesResponse.getIdMarca());
	}

	@Test
	void testSetIdMarca() {
		pricesResponse.setIdMarca(1);
		assertEquals(1, pricesResponse.getIdMarca());
	}

	@Test
	void testGetTarifa() {
		pricesResponse.setTarifa(1);;
		assertEquals(1, pricesResponse.getTarifa());
	}

	@Test
	void testSetTarifa() {
		pricesResponse.setTarifa(1);;
		assertEquals(1, pricesResponse.getTarifa());
	}

	
	@Test
	void testGetFechaInicio() {
		pricesResponse.setFechaInicio(null);
		assertEquals(null, pricesResponse.getFechaInicio());
	}

	@Disabled("Desabilitado hasta arreglar cast de String a Date\"")
	@Test
	void testSetFechaInicio() {
		pricesResponse.setFechaInicio(null);
		assertEquals(null, pricesResponse.getFechaInicio());
	}

	@Test
	void testGetFechaTermino() {
		pricesResponse.setFechaTermino(null);
		assertEquals(null, pricesResponse.getFechaInicio());
	}

	@Disabled("Desabilitado hasta arreglar cast de String a Date\"")
	@Test
	void testSetFechaTermino() {
		pricesResponse.setFechaTermino(null);
		assertEquals(null, pricesResponse.getFechaInicio());
	}

	@Test
	void testGetPrecio() {
		pricesResponse.setPrecio(BigDecimal.valueOf(35.5));;
		assertEquals(BigDecimal.valueOf(35.5), pricesResponse.getPrecio());
	}

	@Test
	void testSetPrecio() {
		pricesResponse.setPrecio(BigDecimal.valueOf(35.5));;
		assertEquals(BigDecimal.valueOf(35.5), pricesResponse.getPrecio());
	}

}
