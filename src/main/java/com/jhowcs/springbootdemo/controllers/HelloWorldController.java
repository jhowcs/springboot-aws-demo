package com.jhowcs.springbootdemo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fruits")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<List<String>> fruits() {
        var fruits = List.of("banana, apple, pineapple, peach, raspberry, blueberry, orange");
        return ResponseEntity.ok(fruits);
    }
}
