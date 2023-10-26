package com.senai.julia.prjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.senai.julia.prjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}