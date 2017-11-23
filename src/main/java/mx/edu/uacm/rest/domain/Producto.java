package mx.edu.uacm.rest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="producto")

public class Producto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//Haremos uso de Hibernate
	private Long id;
	
	
	@NotNull
	private String descripcion;
	
	
	public Producto(){
		
	}
		
	public Producto(String desc) {
		this.descripcion = desc;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
