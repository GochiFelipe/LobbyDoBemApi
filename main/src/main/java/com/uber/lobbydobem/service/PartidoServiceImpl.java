package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.lobbydobem.model.Partido;
import com.uber.lobbydobem.repository.PartidoRepository;

@Service(value = "partidoService")
public class PartidoServiceImpl implements PartidoService{
	
	@Autowired
	PartidoRepository partidoRepository;

	@Override
	public Partido findByName(String nome) {
		return partidoRepository.findByNome(nome);
	}

	@Override
	public Optional<Partido> findById(Long id) {
		return partidoRepository.findById(id);
	}

	@Override
	public List<Partido> findAll() {
		return partidoRepository.findAll();
	}

}
