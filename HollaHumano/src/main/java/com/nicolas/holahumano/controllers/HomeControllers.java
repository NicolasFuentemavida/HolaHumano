package com.nicolas.holahumano.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeControllers {
	
	@RequestMapping("")
	public String variableParametro(@RequestParam(value="name", required = false) String parametro, @RequestParam(value="last-name", required = false) String apellido ) {
		
		if(parametro == null){
			parametro = "Human";
		}if(apellido == null) {
			apellido = "";
		}
		
		return "<h1>Hello "+ parametro + " " + apellido + "</h1><br><p>Welcome to SpringBoot!</p>";			
	}
	
}
