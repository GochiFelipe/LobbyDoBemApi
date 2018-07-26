package com.uber.lobbydobem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.State;
import com.uber.lobbydobem.service.StateService;


@RestController
@RequestMapping("/state")
public class StateController {

	@Autowired
	private StateService stateService;
	
	@GetMapping
	public List<State> listAllStates(){
		return stateService.findAllStates();
	}
}
