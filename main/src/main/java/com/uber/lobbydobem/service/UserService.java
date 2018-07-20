package com.uber.lobbydobem.service;

import java.util.List;

import com.uber.lobbydobem.model.User;

public interface UserService {

	User save(User user);
	List<User> findAll();
	void delete(long id);
}
