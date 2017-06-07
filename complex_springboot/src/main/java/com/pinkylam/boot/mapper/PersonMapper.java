package com.pinkylam.boot.mapper;

import com.pinkylam.boot.entity.Person;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author Pinky Lam 908716835@qq.com
 * @date 2017年6月7日 上午10:55:50
 */
@Mapper
public interface PersonMapper {

	@Delete("DELETE FROM person WHERE ID =#{id}")
    void delete(Long id);

	@Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })
	@Select("SELECT name, age FROM person")
	List<Person> findAll();

	@Select("SELECT * FROM person WHERE NAME = #{name}")
	Person findByName(@Param("name") String name);

	@Insert("INSERT INTO person(NAME, AGE) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);

	@Insert("INSERT INTO person(name, age) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
	int insertByMap(Map<String, Object> map);

	@Insert("INSERT INTO person(name, age) VALUES(#{name}, #{age})")
	int insertByPerson(Person person);

	@Update("UPDATE person SET age=#{age} WHERE name=#{name}")
	void update(Person person);
}
