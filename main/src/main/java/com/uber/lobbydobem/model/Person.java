package com.uber.lobbydobem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long personId;
	
	@Column
	private String name;
	@Column
	private String middlename;
	@Column
	private String lastname;
	@Column
	private String cpf;
	@Column
	private String address;
	@Column
	private String complements;
	@Column
	private String cep;
	@Column
	private String email;
	@Column
	private String phoneNumber;
	@Column
	private String commercialNumber;
	@Column 
	private String residencialNumber;
	
	@OneToOne
	@JoinColumn(name="user_id")
	private User user;
	
//	@OneToMany
//	@JoinColumn(name="activity_id")
//	private List<Activity> activitys;
	
	
	
	public Long getPersonId() {
		return personId;
	}
	public void setPersonId(Long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getComplements() {
		return complements;
	}
	public void setComplements(String complements) {
		this.complements = complements;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCommercialNumber() {
		return commercialNumber;
	}
	public void setCommercialNumber(String commercialNumber) {
		this.commercialNumber = commercialNumber;
	}
	public String getResidencialNumber() {
		return residencialNumber;
	}
	public void setResidencialNumber(String residencialNumber) {
		this.residencialNumber = residencialNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
//	public List<Activity> getActivitys() {
//		return activitys;
//	}
//	public void setActivitys(Activity activitys) {
//		this.activitys.add(activitys);
//	}
	
}
