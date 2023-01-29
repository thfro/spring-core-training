package org.example.orders;

import org.example.comm.MessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class OrderService {

    @Value( "${myProperty}" )
    private String myProperty;

    private final MessageService messageService;


    // @Autowired
    // As of Spring Framework 4.3, an @Autowired annotation is no longer necessary
    // if the target bean only defines one constructor.
    //
    // Alternatively, use setter based dependency injection
    public OrderService(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("Initializing OrderService... myProperty=" + myProperty);
    }

    @PreDestroy
    public void myCleanupMethod() {
        System.out.println("Destroying OrderService...");
    }

    public boolean processOrder(Order order) {
        // do some business logic...
        messageService.sendMessage("Order " + order.getOrderId() + " successfully processed", order.getCustomer());
        return true;
    }
}
