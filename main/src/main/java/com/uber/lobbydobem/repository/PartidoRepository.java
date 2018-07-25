package com.uber.lobbydobem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uber.lobbydobem.model.Partido;

@Repository
public interface PartidoRepository extends JpaRepository<Partido, Long>{
	public Partido findByNome(String nome);
}
