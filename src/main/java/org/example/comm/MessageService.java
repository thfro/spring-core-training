package org.example.comm;

import org.example.orders.Customer;

public interface MessageService {
    boolean sendMessage(String msg, Customer customer);
}
