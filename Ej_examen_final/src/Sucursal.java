


/**
 * Clase creada que guarda cada sucursal que lleva varios hoteles. 
 * @author salortjo
 * @since 1.0
 * @see Hotel
 *
 */
public class Sucursal {
	
	private String codsucursal;
	private String direccion;

	private String telefono;
	private Hotel[] hoteles;
	
	public Sucursal() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the codsucursal Devolvemos el codigo que tiene cada sucursal
	 */
	public String getCodsucursal() {
		return codsucursal;
	}

	/**
	 * @param codsucursal the codsucursal to set
	 */
	public void setCodsucursal(String codsucursal) {
		this.codsucursal = codsucursal;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the hoteles
	 */
	public Hotel[] getHoteles() {
		return hoteles;
	}

	/**
	 * @param hoteles the hoteles to set
	 */
	public void setHoteles(Hotel[] hoteles) {
		this.hoteles = hoteles;
	}

	
	
	

}
