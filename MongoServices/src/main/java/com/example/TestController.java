package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.mapping.Document;
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
    MongoOperations mongoOperations;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    String savaUser(@RequestBody User user){
        mongoOperations.insert(user);
        return user.getName() + ": " + user.getAge();
    }



}
