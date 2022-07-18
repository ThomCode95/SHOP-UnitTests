package mx.com.zara.prices;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class ShopApplicationTests {
	
	/*
	 * Test hecho solamente para cubrir el coverage de la clase principal
	 */
	@Test
	void contextLoads(ApplicationContext applicationContext) throws Exception {
		assertThat(applicationContext).isNotNull();
	}

}