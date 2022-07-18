/**
 * 
 */
package mx.com.zara.prices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import mx.com.zara.prices.entities.PricesEntity;

/**
 * @author Danny
 *
 */
@Repository
public interface PricesRepository extends JpaRepository<PricesEntity, Integer>{
	
	/**
	 * RN: PRIORITY: Desambiguador de aplicación de precios. Si dos tarifas coinciden en un rago de fechas se
	 * aplica la de mayor prioridad (mayor valor numérico).
	 * @param applicationDate
	 * @return
	 */
	@Query(value = "SELECT TOP 1 * " 
			+ "FROM PRICES " 
			+ "WHERE :applicationDate BETWEEN START_DATE and END_DATE "
			+ "AND BRAND_ID = :idBrand "			
			+ "AND PRODUCT_ID = :idProduct "
			+ "ORDER BY PRIORITY DESC",
			nativeQuery = true)
	PricesEntity findPricesByIdProductAndBrand(
			@Param("applicationDate") String applicationDate,
			@Param("idBrand") String idBrand,
			@Param("idProduct") String idProduct);

}
