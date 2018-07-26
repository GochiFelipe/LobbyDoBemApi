package com.uber.lobbydobem.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CANDIDATOS")
public class Candidates {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long candidatoId;
	@Column
	private String nome;
	
	@OneToOne
	@JoinColumn(name="partidoId")
	private Partido partido;
	
	@Column(name="url_foto")
	private String urlFoto;
	@Column
	private String telefone;
	@Column
	private String fax;
	@Column
	private String email;
	@Column
	private String site;
	@Column
	private String facebook;
	@Column
	private String twitter;
	@Column
	private String instagram;
	@Column
	private String endereco;
	@Column
	private String andar;
	@Column
	private String sala;
	@Column
	private String state;
	@ManyToMany(mappedBy="candidates")
	private List<Activity> activity;
	

	
	public Long getCandidatoId() {
		return candidatoId;
	}
	public void setCandidatoId(Long candidatoId) {
		this.candidatoId = candidatoId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}
	public String getUrlFoto() {
		return urlFoto;
	}
	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}
	public String getSala() {
		return sala;
	}
	public void setSala(String sala) {
		this.sala = sala;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
