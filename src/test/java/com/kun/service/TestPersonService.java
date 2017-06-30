package com.kun.service;

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
public class TestPersonService {

    @Resource
    private PersonService personService;

    @Test
    public void getPerson(){
        System.out.println("hello");
        System.out.println(personService.getPerson(1).getName());
    }
}
