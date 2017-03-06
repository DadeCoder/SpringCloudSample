package com.example.didispace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2017/2/25.
 */
@RestController
@RequestMapping("/api/test")
public class HelloApplicationTests {

    @Autowired
    private Sender sender;

    @RequestMapping("/hello")
    public void hello() throws Exception {
        sender.send();
    }

}
