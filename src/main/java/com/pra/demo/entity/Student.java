package com.pra.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name;
    private int age;
    private String std;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }
}
