package com.example.Week17SeminarMatthew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceImplTest {

    @Test
    public void testHelloWorld() {
        HelloService helloService = new HelloServiceImpl();
        String result = helloService.getHello();
        assertEquals("Hello world", result);
    }
}