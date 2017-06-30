package com.kun.controller;

import com.kun.domain.Person;
import com.kun.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


/**
 * Created by Crazy-kun on 2017/6/29.
 */
@Controller
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index(){

        return "index";
    }

    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public @ResponseBody Person getPerson(){

        return personService.getPerson(1);
    }

}
