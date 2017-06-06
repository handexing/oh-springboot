package com.pinkylam.boot.service;

import com.pinkylam.boot.entity.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午3:06:10
 */
@Service
public class PersonService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void create(Person person) {
		jdbcTemplate.update("insert into PERSON(NAME, AGE) values(?, ?)", person.getName(), person.getAge());
	}

	public void deleteAll() {
		jdbcTemplate.update("delete from PERSON");
	}

	public void deleteById(Long id) {
		jdbcTemplate.update("delete from PERSON where ID = ?", id);
	}

	public Integer getAll() {
		return jdbcTemplate.queryForObject("select count(1) from PERSON", Integer.class);
	}

}
