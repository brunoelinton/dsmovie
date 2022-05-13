package com.brunoelinton.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunoelinton.dsmovie.entities.Score;
import com.brunoelinton.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
