package com.uber.lobbydobem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uber.lobbydobem.model.Activity;
import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.repository.ActivityRepository;

@Service(value = "activityService")
public class ActivityServiceImpl implements ActivityService{
	
	@Autowired
	ActivityRepository activityRepository;
	

	@Override
	public Activity save(Activity activity) {
		return activityRepository.save(activity);
	}
	

	@Override
	public Optional<Activity> findById(Long id) {
		return activityRepository.findById(id);
	}


	@Override
	public void delete(Long id) {
		Optional<Activity> activity = activityRepository.findById(id);
		activity.get().setEnable(false);
		activityRepository.save(activity.get());
	}

	@Override
	public List<Activity> findByPerson(Person person) {
		return activityRepository.findByPerson(person);
	}

	@Override
	public List<Activity> findByPersonAndEnable(Person person, Boolean enable) {
		return activityRepository.findByPersonAndEnable(person, enable);
	}

}
