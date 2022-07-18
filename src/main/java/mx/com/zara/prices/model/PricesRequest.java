/**
 * 
 */
package mx.com.zara.prices.model;

/**
 * @author Danny
 *
 */
public class PricesRequest {

	/**
	 * fecha de inicio
	 *  
	 */
	private String fechaAplicacion; 
	/**
	 * idProducto
	 */
	private Integer idProducto;
	/**
	 * idBrand
	 */
	private Integer idMarca;
	
	/**
	 * @return the fechaAplicacion
	 */
	public String getFechaAplicacion() {
		return fechaAplicacion;
	}
	/**
	 * @param fechaAplicacion the fechaAplicacion to set
	 */
	public void setFechaAplicacion(String fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}
	/**
	 * @return the idProducto
	 */
	public Integer getIdProducto() {
		return idProducto;
	}
	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	/**
	 * @return the idBrand
	 */
	public Integer getIdMarca() {
		return idMarca;
	}
	/**
	 * @param idBrand the idBrand to set
	 */
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	
}
