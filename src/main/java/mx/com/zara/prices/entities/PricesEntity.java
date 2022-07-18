/**
 * 
 */
package mx.com.zara.prices.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Danny
 *
 */
@Entity
@Table(name="PRICES")
public class PricesEntity {
	
	@Column(name = "BRAND_ID")
	private int idBrand;
	
	@Id
	@Column(name = "PRICE_LIST")
	private int priceList;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "PRODUCT_ID")
	private int productId;
	
	@Column(name = "PRIORITY")
	private int priority;
	
	@Column(name = "PRICE")
	private BigDecimal price;
	
	@Column(name = "CURR")
	private String currency;

	/**
	 * @return the idBrand
	 */
	public int getIdBrand() {
		return idBrand;
	}

	/**
	 * @param idBrand the idBrand to set
	 */
	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	/**
	 * @return the priceList
	 */
	public int getPriceList() {
		return priceList;
	}

	/**
	 * @param priceList the priceList to set
	 */
	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	
}
