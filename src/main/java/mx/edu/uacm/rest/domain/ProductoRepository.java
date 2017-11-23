package mx.edu.uacm.rest.domain;

import org.springframework.data.repository.CrudRepository;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
	
	//SE agrega al crear la interfaz el CRUD repository
}
