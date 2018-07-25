package com.uber.lobbydobem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.model.User;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

	Person findByUser(User user);
}
