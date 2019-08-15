package com.jose.core.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose.core.entity.Pelicula;
import com.jose.core.services.PeliculaService;

@RestController
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	@GetMapping("/listaPelicula")
	public List<Pelicula> listaPelicula(){
		return peliculaService.listaPelicula();
	}
}
