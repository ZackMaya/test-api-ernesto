package mx.edu.uacm.rest.controller;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import mx.edu.uacm.rest.domain.Producto;
import mx.edu.uacm.rest.domain.Saludo;
import mx.edu.uacm.rest.services.ProductoService;

@RestController
@RequestMapping("/api")
public class SaludoController {

	private static final String plantilla= "Hola %s";
	
	//Valor atomico, con un autoincrementador
	private final AtomicLong contador = new AtomicLong();
	
	//inyección de dependencias
	@Autowired
	ProductoService productoservice;
	
	
	//mapeo para los métodos get, post, put, delete (todas las operaciones http)
	//get ---> /saludame
	//post ----> /saludame...
	@GetMapping("/saludame")
	//@RequestMapping(value="/saludame")
	@ApiOperation(value="obtiene una cadena de saludo", response=Saludo.class)
	public Saludo saludar(@RequestParam (name="tunombre",defaultValue="UACM")String nombre) {
		long incrementado = contador.getAndIncrement();
		String formato = String.format(plantilla, nombre);
		return new Saludo(incrementado, formato);
	}
	
	@PostMapping("/addproducto")
	public void agregar(@RequestParam(value="descripcion") String desc) {
		Producto producto = new Producto(desc);
		productoservice.insertarProducto(producto);		
	}
	
	@GetMapping("/getproducto")
	public List<Producto> obtenerProducto(){
		return productoservice.obtenerProductos();
	}
	
}
