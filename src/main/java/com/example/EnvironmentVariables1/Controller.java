package com.example.EnvironmentVariables1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    Environment environment;

    @GetMapping("/greeting")
    public String returnAuthCode () {
        String authCode = environment.getProperty("authCode");
        String devName = environment.getProperty("devName");
        return ("ciao " + devName + " " + authCode);
    }



}
