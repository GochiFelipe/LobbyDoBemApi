package com.uber.lobbydobem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uber.lobbydobem.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
