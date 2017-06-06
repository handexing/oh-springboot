package com.pinkylam.boot.test;

import com.pinkylam.boot.entity.PersonJpa;
import com.pinkylam.boot.service.PersonJpaService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午3:35:49
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestPersonJpaService {

	@Autowired
	PersonJpaService personJpaService;

	@Test
	public void test() throws Exception {

		PersonJpa personJpa = personJpaService.findOne(1L);
		System.out.println(personJpa.toString());


	}
}
