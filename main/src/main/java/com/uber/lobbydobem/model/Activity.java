package com.uber.lobbydobem.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="ACTIVITY")
public class Activity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long activityId;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	private String goals;
	@Column
	private Date dateCriation;
	@Column
	private Date dateUpdate;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String typeRegister;
	@ManyToMany
	@JoinTable(name="ACTIVITY_CANDIDATE", joinColumns = {
		@JoinColumn(name="activityId")
	}, inverseJoinColumns = {
		@JoinColumn(name="candidatoId")
	})
	private List<Candidates> candidates;
	@ManyToOne
	@JoinColumn(name="person_id")
	@JsonIgnore
	private Person person;
	@Column
	private Boolean enable;

	
	public Long getActivityId() {
		return activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public Date getDateCriation() {
		return dateCriation;
	}
	public void setDateCriation(Date dateCriation) {
		this.dateCriation = dateCriation;
	}
	public Date getDateUpdate() {
		return dateUpdate;
	}
	public void setDateUpdate(Date dateUpdate) {
		this.dateUpdate = dateUpdate;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTypeRegister() {
		return typeRegister;
	}
	public void setTypeRegister(String typeRegister) {
		this.typeRegister = typeRegister;
	}
	public List<Candidates> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidates> candidates) {
		this.candidates = candidates;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	

}
