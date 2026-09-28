package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeControllerTest {

    @Test
    void testHomeEndpoint() {
        HomeController controller = new HomeController();
        String result = controller.home();
        assertEquals("Hello from the Spring Boot backend /home endpoint!", result);
    }
}
