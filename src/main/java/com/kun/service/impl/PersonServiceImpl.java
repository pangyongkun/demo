package com.kun.service.impl;

import com.kun.dao.PersonDao;
import com.kun.domain.Person;
import com.kun.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Crazy-kun on 2017/6/29.
 */
@Service(value = "personService")
public class PersonServiceImpl implements PersonService {

    @Resource
    private PersonDao personDao;

    @Override
    public Person getPerson(Integer id) {
        return personDao.getPerson(id);
    }
}
