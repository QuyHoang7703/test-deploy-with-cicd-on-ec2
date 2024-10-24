package com.example.testDeployOnEC2WithCICD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @GetMapping("/test")
    public String test() {
        return "Hello world";
    }
}
