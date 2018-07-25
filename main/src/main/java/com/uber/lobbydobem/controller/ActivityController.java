package com.uber.lobbydobem.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.Activity;
import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.service.ActivityService;
import com.uber.lobbydobem.service.PersonService;

@RestController
@RequestMapping("/activity")
public class ActivityController {

	@Autowired
	private ActivityService activityService;
	@Autowired
	private PersonService personService;
	
	@GetMapping("/list/{id}")
	public List<Activity> listAllActivityForPerson(@PathVariable(value = "id") Long idPerson){
		Optional<Person> person = personService.findById(idPerson);
		return activityService.findByPerson(person.get());
	}
	
	@PostMapping("/{id}")
	public Activity create(@RequestBody Activity activity, @PathVariable(value = "id") Long idPerson) {
		Optional<Person> person = personService.findById(idPerson);
		activity.setPerson(person.get());
		Date date = Calendar.getInstance().getTime();
		activity.setDateCriation(date);
		return activityService.save(activity);
	}
	
	@GetMapping("/{id}")
	public Optional<Activity> findById(@PathVariable(value = "id") Long id) {
		return activityService.findById(id);
	}
	
	@PutMapping("/update")
	public Activity updateActivity(@RequestBody Activity activity) {
		Date date = Calendar.getInstance().getTime();
		activity.setDateUpdate(date);
		return activityService.save(activity);
	}
	
	@DeleteMapping("/{id}")
	public String delete(@PathVariable(value = "id") Long id) {
		activityService.delete(id);
		return "success";
	}
}
