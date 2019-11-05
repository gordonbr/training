package com.jonathas.training.hello;

import java.util.concurrent.atomic.AtomicLong;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value="Greetings Management System")
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping(value = "/greeting")
    @ApiOperation(value = "View the standard welcome message", response = Greeting.class)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(TEMPLATE, name));
    }
}
