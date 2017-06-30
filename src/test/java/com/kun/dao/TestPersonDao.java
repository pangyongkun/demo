package com.kun.dao;

import com.kun.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Crazy-kun on 2017/6/29.
 */

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestPersonDao {

    @Resource
    private PersonDao personDao;

    @Test
    public void insertPerson(){
        Person person=new Person();
        person.setName("pyk");
        personDao.insertPerson(person);
    }

    @Test
    public void getPerson(){
        System.out.println(personDao.getPerson(1).getName());
    }

}
