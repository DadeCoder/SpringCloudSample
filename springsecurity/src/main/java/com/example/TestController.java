package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2017/3/6.
 */
@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    HunterUserRepository repository;

    @RequestMapping("/hello")
    String hello(){
        return "hello!";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    String add(@RequestBody User user){
        repository.save(user);
        return user.toString();
    }

    @RequestMapping("/login")
    String login(){
        return "login!";
    }


}
