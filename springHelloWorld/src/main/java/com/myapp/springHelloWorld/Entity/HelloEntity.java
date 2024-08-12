package com.myapp.springHelloWorld.Entity;

import org.springframework.stereotype.Component;

@Component
public class HelloEntity {
    private String name;

    public HelloEntity(String name) {
        this.name = name;
    }

    public HelloEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
