package org.wxy.example.sqlite.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wxy.example.sqlite.model.Person;
import org.wxy.example.sqlite.mapper.PersonMapper;

import java.util.List;

@Service
public class PersonService {
	private final static Logger logger = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private  PersonMapper dao;

	public void insert(Person model) {
		int i = dao.insert(model);
		if(i>0){
			logger.info("新增成功");
		}
	}

	public Person select(int id) {
		return dao.select(id);
	}

	public List<Person> selectAll() {
//		return dao.selectAll();
		return dao.findAll();
	}

	public boolean updateValue(Person model) {
		return dao.updateValue(model) > 0;
	}

	public boolean delete(Integer id) {
		return dao.delete(id) > 0;
	}
}
