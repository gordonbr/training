package com.jonathas.training.hello;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingControllerTest {

    private GreetingController greetingController;

    @Before
    public void before() {
        this.greetingController = new GreetingController();
    }

    /**
     * If name is null, should return
     */
    @Test
    public void nullNameTest() {
        Greeting controller = this.greetingController.greeting(null);
        assertEquals("Hello, World!", controller.getContent());
    }
}
