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
        assertEquals("Hello, null!", controller.getContent());
    }

    /**
     * If name is provided, should return the right name
     */
    @Test
    public void notNullNameTest() {
        Greeting controller = this.greetingController.greeting("Test");
        assertEquals("Hello, Test!", controller.getContent());
    }

    private void t(){

    }
}
