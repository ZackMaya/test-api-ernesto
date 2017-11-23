package mx.edu.uacm.rest.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.rest.domain.Producto;
import mx.edu.uacm.rest.domain.ProductoRepository;
import mx.edu.uacm.rest.services.ProductoService;

@Service
public class ProductoServicesImpl implements ProductoService{

	//utilizamos producto
	//inyección de dependencias
	@Autowired
	ProductoRepository productorepository;
	
	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		//Se castea como lista de productos
		return (List<Producto>)productorepository.findAll();
	}
	
	@Override
	public void insertarProducto(Producto producto) {
		productorepository.save(producto);
	}

}
