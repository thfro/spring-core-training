package org.example.orders;

import org.example.comm.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// This class could be merged into OrderProcessTest.
@Configuration
@ComponentScan("org.example.orders")
public class TestConfiguration {
    @Bean
    public MessageService getMessageService() {
        return (msg, customer) -> {
            System.out.println("Mock Service sending message: " + msg);
            return true;
        };
    }
}