package com.uber.lobbydobem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.Candidates;
import com.uber.lobbydobem.service.CandidatesService;

@RestController
@RequestMapping("/candidates")
public class CandidatesController {

	@Autowired
	private CandidatesService candidatesService;
	
	@GetMapping("/all")
	public List<Candidates> findAll() {
		return candidatesService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Candidates> findById(@PathVariable(value = "id") Long id) {
		return candidatesService.findById(id);
	}
}
