package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Dade on 2017/3/6.
 */
@RestController
@RequestMapping("/api/private/test")
public class PrivateController {

    @RequestMapping("/hello")
    String hello(Principal principal){
        System.out.println(principal.getName());
        return "private hello!";
    }



}
