package com.kelaniya.uni.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public String name;
    public int age;
    public String city;

    //todo: we will use getter setter pattern for this

}
