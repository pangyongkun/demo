package com.kun.dao;

import com.kun.domain.Person;

/**
 * Created by Crazy-kun on 2017/6/29.
 */
public interface PersonDao {
    public Person getPerson(Integer id);
    public void  insertPerson(Person person);
}
