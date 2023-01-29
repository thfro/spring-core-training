package org.example.comm;

import org.example.orders.Customer;

public class SmsService implements MessageService {

    public boolean sendMessage(String msg, Customer customer) {
        System.out.println("SMS sent to " + customer.getMobile() + " with message: " + msg);
        return true;
    }
}
