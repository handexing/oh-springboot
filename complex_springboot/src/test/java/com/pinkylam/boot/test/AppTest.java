package com.pinkylam.boot.test;

import com.pinkylam.boot.service.MyProperties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AppTest {

	private static final Log log = LogFactory.getLog(AppTest.class);

	@Autowired
	private MyProperties properties;

	@Test
	public void test1() throws Exception {
		log.info("随机字符串 : " + properties.getValue());
		log.info("随机int : " + properties.getNumber());
		log.info("随机long : " + properties.getBignumber());
		log.info("随机10以下 : " + properties.getRandom1());
		log.info("随机10-20 : " + properties.getRandom2());
		log.info("自定义 : " + properties.getName());
	}

}
