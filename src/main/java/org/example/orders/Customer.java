package org.example.orders;

public class Customer {
    private String email;
    private String mobile;

    public Customer(String email, String mobile) {
        this.email = email;
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }
}
