package com.kun.domain;

import javax.persistence.*;

/**
 * Created by Crazy-kun on 2017/6/29.
 */
@Entity
@Table(name = "person")
public class Person {

    private Integer id;
    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
