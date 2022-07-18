package mx.com.zara.prices.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Esta clase hace los test de Price Request, los metodos de esta clase son 
 * getters y setters de los atributos:
 * 
 * 			String fechaAplicacion,
			Integer idProducto,
			Integer idMarca
 */
class PricesRequestTest {

	
	private static PricesRequest pricesRequest;
	
	//Antes de correr cada test creara el objeto
	@BeforeEach
	public void setUp() {
		pricesRequest = new PricesRequest();
		System.out.println("@BeforeEach -> setUp()");
	}
	
	//Despues de correr cada test borrara cada objeto para hacer limpieza de memoria
	@AfterEach
	public void tearDown() {
		pricesRequest = null;
		System.out.println("@AfterEach -> tearDown()");
	}
	
	
	
	@Test
	void testGetFechaAplicacion() {
		pricesRequest.setFechaAplicacion("2020-06-14 00:00:00");
		assertEquals("2020-06-14 00:00:00", pricesRequest.getFechaAplicacion());
	}

	@Disabled("Deshabilitado hasta encontrar la forma de hacer un cast de String a Date")
	@Test
	void testSetFechaAplicacion() {
		pricesRequest.setFechaAplicacion("2020-06-14 00:00:00");
		assertEquals("2020-06-14 00:00:00", pricesRequest.getFechaAplicacion());
	}

	
	@Test
	void testGetIdProducto() {
		pricesRequest.setIdProducto(35455);
		assertEquals(35455, pricesRequest.getIdProducto());
	}

	@Test
	void testSetIdProducto() {
		pricesRequest.setIdProducto(35455);
		assertEquals(35455, pricesRequest.getIdProducto());
	}

	@Test
	void testGetIdMarca() {
		pricesRequest.setIdMarca(1);
		assertEquals(1, pricesRequest.getIdMarca());
	}

	@Test
	void testSetIdMarca() {
		pricesRequest.setIdMarca(1);
		assertEquals(1, pricesRequest.getIdMarca());
	}

}
