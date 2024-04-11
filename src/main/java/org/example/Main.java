package org.example;

import org.example.model.Customer;
import org.example.service.customer.CustomerService;
import org.example.utility.ApplicationContext;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = ApplicationContext.getCustomerService();
        Customer customer = new Customer("mohammad" ,  "ahmadi" , "09121111111" ,
                "address" , "0021212121" , "AA12345" );

        customerService.saveOrUpdate(customer);

    }
}