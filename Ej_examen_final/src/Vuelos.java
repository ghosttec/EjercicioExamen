import java.util.Date;


public class Vuelos {

	private int numeroVuelo;
	private Date fechaVuelo;
	private String origen;
	private String destino;
	private int plazasTotal;
	private int plazasTuris;
	
	
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
