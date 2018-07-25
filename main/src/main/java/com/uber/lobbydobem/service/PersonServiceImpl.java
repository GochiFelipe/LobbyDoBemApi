package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.model.User;
import com.uber.lobbydobem.repository.PersonRepository;

@Service(value = "personService")
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonRepository personRepository;

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Optional<Person> findById(Long id) {
		return personRepository.findById(id);
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		personRepository.deleteById(id);
	}

	@Override
	public Person findByUser(User user) {
		return personRepository.findByUser(user);
	}

}
