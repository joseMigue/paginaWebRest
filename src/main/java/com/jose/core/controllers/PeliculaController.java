package com.jose.core.controllers;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.annotations.Loader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jose.core.entity.Pelicula;
import com.jose.core.services.PeliculaService;

@RestController
public class PeliculaController {

	@Autowired
	private PeliculaService peliculaService;
	
	private static final Log LOG = LogFactory.getLog(PeliculaController.class);
	
	@GetMapping("/listaPelicula")
	public List<Pelicula> listaPelicula(){
		return peliculaService.listaPelicula();
	}
	
	@GetMapping("/detallePeliculaNombre{nombre}")
	public Pelicula detallePelicula(@ModelAttribute(name = "nombre")String nombre) {
		return peliculaService.detallePelicula(nombre);
	}
	@GetMapping("/detallePeliculaId{id}")
	public Pelicula detallePelicula2(@ModelAttribute(name="id")int id) {
		return peliculaService.detallePelicula(id);
	}
	@PostMapping("/guardar")
	public boolean crearPelicula(@RequestBody @Valid Pelicula peli) {
		return peliculaService.guardarPelicula(peli);
	}
	
	@PutMapping("/actualizar{id}")
	public boolean actualizarPelicula(@ModelAttribute(name="id") int id,@RequestBody @Valid Pelicula peli) {
		LOG.info(peli);
		LOG.info(id);
		return peliculaService.guardarPelicula(peli);
	}
	@DeleteMapping("/borrar{id}")
	public void borrar(@ModelAttribute(name="id")int id) {
		peliculaService.borrar(id);
	}
}
