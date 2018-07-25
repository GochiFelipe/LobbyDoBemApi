package com.uber.lobbydobem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.Partido;
import com.uber.lobbydobem.service.PartidoService;

@RestController
@RequestMapping("/partidos")
public class PartidoController {

	@Autowired
	private PartidoService partidoService;
	
	@GetMapping("/all")
	public List<Partido> listAllPartidos(){
		return partidoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Partido> getPartidoById(@PathVariable(value = "id") Long id){
		return partidoService.findById(id);
	}
	
	@GetMapping("/{name}")
	public Partido getPartidoByName(@PathVariable(value = "name") String name) {
		return partidoService.findByName(name);
	}
	
	
}
