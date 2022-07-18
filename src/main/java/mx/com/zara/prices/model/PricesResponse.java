/**
 * 
 */
package mx.com.zara.prices.model;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Danny
 *
 */
public class PricesResponse {
	
	private int idProducto;
	private int idMarca;
	private int tarifa;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fechaInicio; 
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date fechaTermino; 
	private BigDecimal precio;
	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * @return the idMarca
	 */
	public int getIdMarca() {
		return idMarca;
	}
	/**
	 * @param idMarca the idMarca to set
	 */
	public void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	/**
	 * @return the tarifa
	 */
	public int getTarifa() {
		return tarifa;
	}
	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}
	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	/**
	 * @return the fechaTermino
	 */
	public Date getFechaTermino() {
		return fechaTermino;
	}
	/**
	 * @param fechaTermino the fechaTermino to set
	 */
	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	/**
	 * @return the precio
	 */
	public BigDecimal getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	} 

}
