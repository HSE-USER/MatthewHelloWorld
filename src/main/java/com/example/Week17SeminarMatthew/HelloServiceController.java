package com.example.Week17SeminarMatthew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServiceController {
    private final HelloService helloService;

    @Autowired
    HelloServiceController(HelloService helloService){
        this.helloService = helloService;
    }

    @GetMapping("/helloWorld")
    String helloWorld(@RequestParam(value = "helloWorld", defaultValue = "test") String helloWorld){
        return helloService.getHello();
    }

}
