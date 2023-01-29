package org.example.comm;

import org.example.orders.Customer;

public class EmailService implements MessageService {

    public boolean sendMessage(String msg, Customer customer) {
        System.out.println("Email sent to " + customer.getEmail() + " with message: " + msg);
        return true;
    }
}
