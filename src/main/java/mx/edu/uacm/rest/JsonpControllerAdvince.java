package mx.edu.uacm.rest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

@ControllerAdvice
public class JsonpControllerAdvince extends AbstractJsonpResponseBodyAdvice{

	public JsonpControllerAdvince() {
		super("callback");
		
	}

	
}
