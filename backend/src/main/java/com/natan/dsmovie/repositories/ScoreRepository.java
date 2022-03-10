package com.natan.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natan.dsmovie.entities.Score;

public interface ScoreRepository extends JpaRepository<Score, Long> {
	
}
