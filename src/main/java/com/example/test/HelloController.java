package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello", produces = "text/plain")
    public String hello() {
        return "Hello, world!";
    }
}
