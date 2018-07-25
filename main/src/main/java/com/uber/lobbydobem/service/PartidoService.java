package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import com.uber.lobbydobem.model.Partido;

public interface PartidoService {
	Partido findByName(String name);
	Optional<Partido> findById(Long id);
	List<Partido> findAll();
}
