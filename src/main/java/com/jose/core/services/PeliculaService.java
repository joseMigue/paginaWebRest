package com.jose.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jose.core.entity.Pelicula;
import com.jose.core.repositories.PeliculaRepository;

@Service
public class PeliculaService {

	@Autowired
	private PeliculaRepository peliculaRepository;
	
	
	public List<Pelicula> listaPelicula(){
		return  peliculaRepository.findAll();
	}
	
}
