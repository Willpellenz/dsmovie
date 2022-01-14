package com.devsuperior.dismovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dismovie.entities.Score;
import com.devsuperior.dismovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
