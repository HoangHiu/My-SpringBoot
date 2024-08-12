package com.myapp.springHelloWorld.Service;

import com.myapp.springHelloWorld.Entity.HelloEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService{
    @Autowired
    HelloEntity helloEntity;

    public String sayHello(String name){
        helloEntity.setName(name);
        return "Hello " + helloEntity.getName();
    }
}
