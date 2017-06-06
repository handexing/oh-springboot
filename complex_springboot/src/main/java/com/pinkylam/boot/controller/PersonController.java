package com.pinkylam.boot.controller;

import com.pinkylam.boot.entity.Person;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	private static Map<Long, Person> persons;

	static {
		persons = Collections.synchronizedMap(new HashMap<Long, Person>());
		Person person = new Person(1L, "jack", 10);
		persons.put(1L, person);
	}


	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable Long id) {
		persons.remove(id);
		return "success";
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Person getUser(@PathVariable Long id) {
		return persons.get(id);
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<Person> getUserList() {
		List<Person> r = new ArrayList<Person>(persons.values());
		return r;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String postUser(@ModelAttribute Person user) {
		persons.put(user.getId(), user);
		return "success";
	}

	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public String putUser(@PathVariable Long id, @ModelAttribute Person user) {
		Person u = persons.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
		persons.put(id, u);
        return "success";
    }

}
