package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.lobbydobem.model.Candidates;
import com.uber.lobbydobem.repository.CandidateRepository;

@Service(value = "candidateService")
public class CandidateServiceImpl implements CandidatesService{

	@Autowired
	CandidateRepository candidateRepository; 
	
	@Override
	public List<Candidates> findAll() {
		return candidateRepository.findAll();
	}

	@Override
	public Optional<Candidates> findById(Long id) {
		return candidateRepository.findById(id);
	}

}
