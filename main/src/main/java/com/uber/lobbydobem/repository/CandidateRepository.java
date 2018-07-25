package com.uber.lobbydobem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.lobbydobem.model.Candidates;

public interface CandidateRepository extends JpaRepository<Candidates, Long>{

}
