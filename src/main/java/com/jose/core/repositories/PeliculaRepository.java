package com.jose.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jose.core.entity.Pelicula;

@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Integer>{

}
