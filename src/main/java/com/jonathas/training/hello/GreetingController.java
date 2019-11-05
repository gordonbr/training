package com.jonathas.training.hello;

import java.util.concurrent.atomic.AtomicLong;

import com.jonathas.training.repository.GreetingRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value="Greetings Management System")
public class GreetingController {

    @Autowired
    private GreetingRepository greetingRepository;

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @PostMapping(value = "/greeting")
    @ApiOperation(value = "Creates a new Greeting", response = Greeting.class)
    public Greeting addGreeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting greeting = new Greeting();
        greeting.setContent(String.format(TEMPLATE, name));
        return greetingRepository.save(greeting);

    }

    @GetMapping(value = "/greeting")
    @ApiOperation(value = "Find all greetings", response = Greeting.class)
    public Iterable<Greeting> getAllGreetings() {
        return greetingRepository.findAll();

    }
}
