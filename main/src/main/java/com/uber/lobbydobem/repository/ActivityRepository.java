package com.uber.lobbydobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uber.lobbydobem.model.Activity;
import com.uber.lobbydobem.model.Person;

public interface ActivityRepository extends JpaRepository<Activity, Long>{
	public List<Activity> findByPerson(Person person);
	public List<Activity> findByPersonAndEnable(Person person, Boolean booleanEnable);
}
