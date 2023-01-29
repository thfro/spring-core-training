package org.example;

import org.example.orders.Customer;
import org.example.orders.Order;
import org.example.orders.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

public class Main {

    public static void main(String[] args) {
        // Annotation-based configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);

        // XML-based configuration
        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // access environment variables
        Environment env = context.getEnvironment();
        if (env.containsProperty("myProperty")) {
            System.out.println("Property myProperty set to " + env.getProperty("myProperty"));
        } else {
            System.out.println("Property myProperty not present.");
        }

        Order order = new Order(1, new Customer("customer@example.org", "0170-12345678"));

        OrderService op = context.getBean(OrderService.class);
        op.processOrder(order);

        context.close();
    }
}