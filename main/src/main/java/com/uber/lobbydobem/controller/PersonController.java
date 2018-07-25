package com.uber.lobbydobem.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uber.lobbydobem.model.Person;
import com.uber.lobbydobem.model.User;
import com.uber.lobbydobem.service.PersonService;
import com.uber.lobbydobem.service.UserService;


@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@Autowired
	private UserService userService;
	
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @GetMapping("/user/{userId}")
    public Person findByUser(@PathVariable(value = "userId") Long userId) {
    	Optional<User> user = userService.findById(userId);
		return personService.findByUser(user.get());
    }
	
	@GetMapping("/all")
	public List<Person> findAll(){
		List<Person> list = new ArrayList<>();
		personService.findAll().iterator().forEachRemaining(list::add);
		return list;
	}
	
//	@GetMapping("{id}/allActivity")
//	public List<Activity> findAllActivityByPersonId(@PathVariable(value = "id") Long id){
//		Optional<Person> person = personService.findById(id);
//		List<Activity> list = new ArrayList<>();
////		person.get().getActivitys().iterator().forEachRemaining(list::add);
//		return list;
//	}
//	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person){
		User user = userService.save(person.getUser());
    	user.setPassword(passwordEncoder.encode(user.getPassword()));
		person.setUser(user);
		return personService.save(person);
	}
	
	@PutMapping("/update")
	public Person updatePerson(@RequestBody Person person) {
		return personService.save(person);
	}
	
	@DeleteMapping("/{id}")
	public String deletePerson(@PathVariable(value = "id") Long id) {
		personService.delete(id);
		return "success";
	}
	
}
