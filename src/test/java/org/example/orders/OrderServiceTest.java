package org.example.orders;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

class OrderServiceTest {
    private AnnotationConfigApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void test() {
        Order order = new Order(1, new Customer("customer@example.org", "0170-12345678"));
        OrderService op = context.getBean(OrderService.class);
        boolean success = op.processOrder(order);
        assertTrue(success);
    }
}
