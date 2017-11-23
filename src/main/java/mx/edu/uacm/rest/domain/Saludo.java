package mx.edu.uacm.rest.domain;

public class Saludo {

	private long incrementador;
	private String descripcion;
	
	public Saludo(long incrementado, String formato) {
		
		this.incrementador = incrementado;
		this.descripcion = formato;
	}

	/**
	 * @return the incrementador
	 */
	public long getIncrementador() {
		return incrementador;
	}

	/**
	 * @param incrementador the incrementador to set
	 */
	public void setIncrementador(long incrementador) {
		this.incrementador = incrementador;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}

