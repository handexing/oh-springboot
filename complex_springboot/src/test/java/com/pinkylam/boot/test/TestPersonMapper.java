package com.pinkylam.boot.test;

import com.pinkylam.boot.entity.Person;
import com.pinkylam.boot.mapper.PersonMapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月7日 上午10:52:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestPersonMapper {

	@Autowired
	PersonMapper personMapper;


	@Test
	@Rollback
	public void testUserMapper() throws Exception {
		// insert一条数据，并select出来验证
		personMapper.insert("pinkyLam", 20);
		Person u = personMapper.findByName("pinkyLam");
		Assert.assertEquals(20, u.getAge().intValue());

		// update一条数据，并select出来验证
		u.setAge(30);
		personMapper.update(u);
		u = personMapper.findByName("pinkyLam");
		Assert.assertEquals(30, u.getAge().intValue());

		// 删除这条数据，并select验证
		personMapper.delete(u.getId());
		u = personMapper.findByName("pinkyLam");
		Assert.assertEquals(null, u);

		u = new Person("handx", 20);
		personMapper.insertByPerson(u);
		Assert.assertEquals(20, personMapper.findByName("handx").getAge().intValue());

		Map<String, Object> map = new HashMap<>();
		map.put("name", "kangkang");
		map.put("age", 15);
		personMapper.insertByMap(map);
		Assert.assertEquals(15, personMapper.findByName("kangkang").getAge().intValue());

		List<Person> list = personMapper.findAll();
		for (Person person : list) {
			Assert.assertEquals(null, person.getId());
			Assert.assertNotEquals(null, person.getName());
		}

	}
}
