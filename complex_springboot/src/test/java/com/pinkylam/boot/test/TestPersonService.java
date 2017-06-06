package com.pinkylam.boot.test;

import com.pinkylam.boot.entity.Person;
import com.pinkylam.boot.service.PersonService;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestPersonService {

	@Autowired
	PersonService personService;

	@Before
	public void setUp() {
		// 准备，清空user表
		personService.deleteAll();
	}

	@Test
	public void test() throws Exception {

		personService.create(new Person("小强", 10));
		personService.create(new Person("小花", 10));
		personService.create(new Person("jack", 10));
		personService.create(new Person("rose", 10));

		System.out.println("共：" + personService.getAll());

		personService.deleteById(1L);


	}
}
