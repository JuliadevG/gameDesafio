package com.senai.julia.prjGame.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.julia.prjGame.entities.Jogo;
import com.senai.julia.prjGame.repositories.JogoRepository;
import java.util.Optional;

@Service
public class JogoServices {
	private final JogoRepository JogoRepository;
	
	@Autowired
	public JogoServices (JogoRepository JogoRepository) {
		this.JogoRepository = JogoRepository;
	}
	
	public Jogo saveJogo(Jogo Jogo) {
		return JogoRepository.save(Jogo);
	}
	
	public Jogo getJogoById(Long id) {
		return JogoRepository.findById(id).orElse(null);
	}
	
	public List<Jogo> getAllJogo(){
		return JogoRepository.findAll();
	}
	
	public void deleteJogo(Long id) {
		JogoRepository.deleteById(id);
	}
	
public Jogo updateJogo(Long id, Jogo novoJogo) {
        Optional<Jogo> jogoOptional = JogoRepository.findById(id);
        if (jogoOptional.isPresent()) {
        	Jogo jogoExistente = jogoOptional.get();
           	jogoExistente.setName(novoJogo.getName());
        	jogoExistente.setPlataform(novoJogo.getPlataform());          
            return JogoRepository.save(jogoExistente); 
        } else {
            return null; 
        }
	}
}
