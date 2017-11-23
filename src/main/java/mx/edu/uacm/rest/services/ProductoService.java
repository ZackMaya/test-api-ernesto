package mx.edu.uacm.rest.services;

import java.util.List;

import mx.edu.uacm.rest.domain.Producto;

public interface ProductoService {
	
	
	List<Producto> obtenerProductos(); 
	
	
	void insertarProducto(Producto producto);
	
	
		
		
	
}
