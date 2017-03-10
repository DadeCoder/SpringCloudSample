package com.example;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by Dade on 2017/3/7.
 */
@RestController
@CrossOrigin
public class LoginController {
        @RequestMapping("/login")
        String login(Principal principal){
            return principal.getName();
        }


        @RequestMapping("/test_1")
        String test(Principal principal){
            return principal.getName()+"test_1";
        }

    @RequestMapping("/test__2")
    String test_2(Principal principal){
        return principal.getName()+"test_2";
    }

}
