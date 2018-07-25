package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.model.User;

public interface PersonService {
	
	Person save(Person person);
	Optional<Person> findById(Long id);
	List<Person> findAll();
	void delete(Long id);
	Person findByUser(User user);

}
