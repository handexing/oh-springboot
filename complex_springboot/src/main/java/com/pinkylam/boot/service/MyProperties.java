package com.pinkylam.boot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyProperties
 * @Description: TODO
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午1:26:58
 */

@Component
public class MyProperties {

	@Value("${com.pinkylam.boot.value}")
	private String value;
	@Value("${com.pinkylam.boot.number}")
	private Integer number;
	@Value("${com.pinkylam.boot.bignumber}")
	private Long bignumber;
	@Value("${com.pinkylam.boot.random1}")
	private Integer random1;
	@Value("${com.pinkylam.boot.random2}")
	private Integer random2;

	@Value("${com.pinkylam.boot.name}")
	private String name;

	public Long getBignumber() {
		return bignumber;
	}

	public String getName() {
		return name;
	}
	public Integer getNumber() {
		return number;
	}

	public Integer getRandom1() {
		return random1;
	}

	public Integer getRandom2() {
		return random2;
	}
	public String getValue() {
		return value;
	}

	public void setBignumber(Long bignumber) {
		this.bignumber = bignumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void setRandom1(Integer random1) {
		this.random1 = random1;
	}

	public void setRandom2(Integer random2) {
		this.random2 = random2;
	}

	public void setValue(String value) {
		this.value = value;
	}


}
