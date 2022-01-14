package com.devsuperior.dismovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dismovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
