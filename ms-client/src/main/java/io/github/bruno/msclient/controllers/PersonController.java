package io.github.bruno.msclient.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {


    @GetMapping
    public String sendStatus() {
        return "Server is running.....";
    }


}
