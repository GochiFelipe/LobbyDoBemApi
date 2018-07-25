package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import com.uber.lobbydobem.model.Candidates;

public interface CandidatesService {
	
	List<Candidates> findAll();
	Optional<Candidates> findById(Long id);

}
