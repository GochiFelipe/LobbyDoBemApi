package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import com.uber.lobbydobem.model.Activity;
import com.uber.lobbydobem.model.Person;

public interface ActivityService {

	List<Activity> findByPerson(Person person);
	List<Activity> findByPersonAndEnable(Person person, Boolean enable);
	Activity save(Activity activity);
	Optional<Activity> findById(Long id);
	void delete(Long id);
}
