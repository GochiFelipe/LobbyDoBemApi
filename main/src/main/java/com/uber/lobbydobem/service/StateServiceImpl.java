package com.uber.lobbydobem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.lobbydobem.model.State;
import com.uber.lobbydobem.repository.StateRepository;

@Service(value="stateService")
public class StateServiceImpl implements StateService{
	
	@Autowired
	StateRepository stateRepository;

	@Override
	public List<State> findAllStates() {
		return stateRepository.findAll();
	}

}
