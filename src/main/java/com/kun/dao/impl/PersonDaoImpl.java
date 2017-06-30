package com.kun.dao.impl;

import com.kun.dao.PersonDao;
import com.kun.domain.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Crazy-kun on 2017/6/29.
 */
@Repository(value = "personDao")
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Person getPerson(Integer id) {

        String hql="select name from person where person.id=?";
        return this.sessionFactory.getCurrentSession()
                .get(Person.class,id);
    }

    @Override
    public void insertPerson(Person person) {
        this.sessionFactory.getCurrentSession().save(person);
    }
}
