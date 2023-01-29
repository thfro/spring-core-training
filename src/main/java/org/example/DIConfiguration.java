package org.example;

import org.example.comm.EmailService;
import org.example.comm.MessageService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:order-app.properties")
public class DIConfiguration {

    @Bean
    public MessageService getMessageService() {
        return new EmailService();
    }
}
