package mx.com.zara.prices;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ShopApplicationTest {
	
	
	/*
	 * Test hecho solamente para cubrir el coverage de la clase principal
	 */

	@Test
	void testMain(ApplicationContext applicationContext) throws Exception {
		ShopApplication.main(new String[] {});
		assertThat(applicationContext).isNotNull();
	}
	
	
	

}


