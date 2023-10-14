package com.jhowcs.springbootdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldController {

    @GetMapping("{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        var message = "";
        if (name.equals("admin")) {
            message = "Welcome Mr. " + name;
        } else {
            message = "Welcome User " + name;
        }

        return ResponseEntity.ok(message);
    }
}
