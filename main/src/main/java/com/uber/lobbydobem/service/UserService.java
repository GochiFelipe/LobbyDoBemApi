package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import com.uber.lobbydobem.model.User;

public interface UserService {

	User save(User user);
	Optional<User> findById(Long id);
	List<User> findAll();
	void delete(long id);
	User findByEmail(String email);
}
