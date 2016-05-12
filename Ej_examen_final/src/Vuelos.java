import java.util.Date;


/**
 * Esta clase lleva los vuelos realizados por la compañia por APALAPUCIA!!!
 * @author rossolad
 * @version 1.0
 * @see Hotel
 * @see Sucursal
 */
public class Vuelos {

	private int numeroVuelo;
	private Date fechaVuelo;
	private String origen;
	private String destino;
	private int plazasTotal;
	private int plazasTuris;
	
	
	/**
	 * Este es el constructor de los vuelos para tener toda su informacion
	 * @param numeroVuelo Este es el numero de vuelo señalando el vuelo que ha cogido
	 * @param fechaVuelo Fecha en la que partio el vuelo
	 * @param origen Lugar de salida del vuelo
	 * @param destino Lugar de llegada del vuelo
	 * @param plazasTotal Numero de plazas total que tiene
	 * @param plazasTuris Numero de plazas para turistas
	 * @since 1.0
	 */
	public Vuelos(int numeroVuelo, Date fechaVuelo, String origen,
			String destino, int plazasTotal, int plazasTuris) {
		super();
		this.numeroVuelo = numeroVuelo;
		this.fechaVuelo = fechaVuelo;
		this.origen = origen;
		this.destino = destino;
		this.plazasTotal = plazasTotal;
		this.plazasTuris = plazasTuris;
	}
	public int getNumeroVuelo() {
		return numeroVuelo;
	}
	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	public Date getFechaVuelo() {
		return fechaVuelo;
	}
	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getPlazasTotal() {
		return plazasTotal;
	}
	public void setPlazasTotal(int plazasTotal) {
		this.plazasTotal = plazasTotal;
	}
	public int getPlazasTuris() {
		return plazasTuris;
	}
	public void setPlazasTuris(int plazasTuris) {
		this.plazasTuris = plazasTuris;
	}
}
