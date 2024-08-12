package com.myapp.springHelloWorld.Controller;

import com.myapp.springHelloWorld.Entity.HelloEntity;
import com.myapp.springHelloWorld.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/hello")
public class HelloController{
    @Autowired
    HelloService helloService;

    @GetMapping("/{name}")
    public String getHello(@PathVariable String name){
        return helloService.sayHello(name);
    }
}
