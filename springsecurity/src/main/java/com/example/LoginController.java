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
}
