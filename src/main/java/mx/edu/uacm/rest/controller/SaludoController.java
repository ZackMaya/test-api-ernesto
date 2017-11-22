package mx.edu.uacm.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import mx.edu.uacm.rest.domain.Saludo;

@RestController
public class SaludoController {

	private static final String plantilla= "Hola %s";
	
	//Valor atomico, con un autoincrementador
	private final AtomicLong contador = new AtomicLong();
	
	//mapeo para los métodos get, post, put, delete (todas las operaciones http)
	//get ---> /saludame
	//post ----> /saludame...
	@GetMapping("/saludame")
	//@RequestMapping(value="/saludame")
	@ApiOperation(value="obtiene una cadena de saludo", response=Saludo.class)
	public Saludo saludar(@RequestParam (name="zack",defaultValue="Hola mundo cruel")String nombre) {
		long incrementado = contador.getAndIncrement();
		String formato = String.format(plantilla, nombre);
		return new Saludo(incrementado, formato);
	}
	
}
