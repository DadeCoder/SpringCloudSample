package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2017/3/6.
 */
@RestController
@RequestMapping("/api/public/test")
public class PublicController {

    @RequestMapping("/hello")
    String hello(){
        return "public hello";
    }

}
