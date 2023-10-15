package com.jhowcs.springbootdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloWorldController {

    @GetMapping("{name}")
    public ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok("Hello " + name);
    }

    @GetMapping("fruits")
    public ResponseEntity<List<String>> fruits() {
        var fruits = List.of("banana, apple, pineapple, peach, raspberry, blueberry");
        return ResponseEntity.ok(fruits);
    }
}
