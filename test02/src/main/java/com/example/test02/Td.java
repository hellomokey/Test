package com.example.test02;

import java.io.Serializable;

/**
 * Created by kengdie on 2016/7/12.
 */
public class Td implements Serializable{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Td(String name, int age){
        this.name = name;
        this.age = age;
    }
}
