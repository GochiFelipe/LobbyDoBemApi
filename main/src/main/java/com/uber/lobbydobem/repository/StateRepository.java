package com.uber.lobbydobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.uber.lobbydobem.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{
	
	@Override
	@Query
	public List<State> findAll();
	
}
