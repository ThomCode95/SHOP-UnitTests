package mx.com.zara.prices.entities;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;

/*
 * En este clase se hace test de los metodos Getter y Setter de la clase PricesEntity
 * No estoy seguro de como implementar test para metodo setter
 */

class PricesEntityTest {
	
	
	Date dt = new Date();
	private static PricesEntity pricesEntity;
	private static BeanTester tester;
	//Antes de correr cada test creara el objeto
	@BeforeEach
	public void setUp() {
		pricesEntity = new PricesEntity();
		//tester = new BeanTester();
		//tester.testBean(PricesEntity.class);
		System.out.println("@BeforeEach -> setUp()");
		
		pricesEntity.setCurrency("EUR");
		pricesEntity.setEndDate(null);
		pricesEntity.setIdBrand(1);
		pricesEntity.setPrice(BigDecimal.valueOf(35.5));
		pricesEntity.setPriceList(1);
		pricesEntity.setPriority(0);
		pricesEntity.setProductId(35455);
		pricesEntity.setStartDate(null);
	}
	
	@Test
	 void myClassTest() {
		tester = new BeanTester();
		tester.testBean(PricesEntity.class);
	}
	
	//Despues de correr cada test borrara cada objeto para hacer limpieza de memoria
	@AfterEach
	public void tearDown() {
		pricesEntity = null;
		tester = null;
		System.out.println("@AfterEach -> tearDown()");
	}

	@Test
	void testGetIdBrand() {
		assertEquals(1,pricesEntity.getIdBrand());
	}

	
	@Test
	void testSetIdBrand(){
		pricesEntity.setIdBrand(1);
		assertEquals(1, pricesEntity.getIdBrand());
	}

	@Test
	void testGetPriceList() {
		assertEquals(1,pricesEntity.getPriceList());
	}

	@Test
	void testSetPriceList(){
		pricesEntity.setPriceList(1);
		assertEquals(1, pricesEntity.getPriceList());
	}

	@Test
	void testGetStartDate() {
		assertEquals(null,pricesEntity.getStartDate());
	}

	
	@Test
	void testSetStartDate()   {
		pricesEntity.setStartDate(null);
		assertEquals(null, pricesEntity.getStartDate());
	}

	@Test
	void testGetEndDate() {
		pricesEntity.getEndDate();
		assertEquals(null,pricesEntity.getEndDate());
	}	
	
	@Test
	void testSetEndDate(){
		pricesEntity.setEndDate(null);
		//SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss");
		//assertEquals(ft.format(dt), pricesEntity.getEndDate());
		assertEquals(null, pricesEntity.getEndDate());
		

	}

	@Test
	void testGetProductId() {
		assertEquals(35455,pricesEntity.getProductId());
	}

	@Test
	void testSetProductId() {
		pricesEntity.setProductId(35455); 
		assertEquals(35455, pricesEntity.getProductId());
	}

	@Test
	void testGetPriority() {
		assertEquals(0,pricesEntity.getPriority());
	}

	@Test
	void testSetPriority(){
		pricesEntity.setPriority(0);
		assertEquals(0,pricesEntity.getPriority());

	}

	@Test
	void testGetPrice() {
		assertEquals(BigDecimal.valueOf(35.5),pricesEntity.getPrice());
		
	}
	
	@Test
	void testSetPrice(){
		pricesEntity.setPrice(BigDecimal.valueOf(35.50));
		assertEquals(BigDecimal.valueOf(35.5),pricesEntity.getPrice());
	}

	@Test
	void testGetCurrency() {
		assertEquals("EUR",pricesEntity.getCurrency());
	}

	@Test
	void testSetCurrency(){
		pricesEntity.setCurrency("EUR");
		assertEquals("EUR",pricesEntity.getCurrency());

	}

}
