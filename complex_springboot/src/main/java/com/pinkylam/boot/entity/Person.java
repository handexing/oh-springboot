package com.pinkylam.boot.entity;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月6日 下午2:18:32
 */
public class Person {

	private Long id;
	private String name;
	private Integer age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Long id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Persion [id=" + id + ", name=" + name + ", age=" + age + "]";
	}


}
