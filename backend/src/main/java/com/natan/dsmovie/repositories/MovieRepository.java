package com.natan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
