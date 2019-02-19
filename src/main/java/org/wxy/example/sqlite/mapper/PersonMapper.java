package org.wxy.example.sqlite.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.wxy.example.sqlite.model.Person;

import java.util.List;

//@Mapper // 启动类上已添加 MapperScan 所以这里不用添加注解
@Component
public interface PersonMapper {

	List<Person> findAll();

	// 插入 并返回自增ID
	@Insert("INSERT INTO person(name, age) VALUES(#{name}, #{age})")
//	@SelectKey(statement = "SELECT seq as id FROM sqlite_sequence WHERE name = 'PERSON'", before = false, keyProperty = "id", resultType = int.class)
	int insert(Person model);

	// 根据 ID 查询
	@Select("SELECT * FROM person WHERE id=#{id}")
	Person select(int id);

	// 查询全部
	@Select("SELECT * FROM person")
	List<Person> selectAll();

	// 更新 value
	@Update("UPDATE person SET name=#{name} WHERE id=#{id}")
	int updateValue(Person model);

	// 根据 ID 删除
	@Delete("DELETE FROM person WHERE id=#{id}")
	int delete(Integer id);

}
