package com.uber.lobbydobem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name="PARTIDO")
public class Partido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long partidoId;
	@Column
	private String nome;
	public Long getPartidoId() {
		return partidoId;
	}
	public void setPartidoId(Long partidoId) {
		this.partidoId = partidoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
