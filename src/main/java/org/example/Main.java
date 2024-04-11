package org.example;

import org.example.connection.SessionFactorySingleton;
import org.example.model.Customer;
import org.example.model.Fruit;
import org.example.service.customer.CustomerService;
import org.example.service.fruit.FruitService;
import org.example.utility.ApplicationContext;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

//        CustomerService customerService = ApplicationContext.getCustomerService();
//        Customer customer = new Customer("mohammad", "ahmadi", "09121111111",
//                "address", "0021212121", "AA12345");
//
//        customerService.saveOrUpdate(customer);

//        SessionFactory instance = SessionFactorySingleton.getInstance();

        FruitService fruitService = ApplicationContext.getFruitService();
        Fruit fruit = new Fruit("Apple", "REd", true, "Kg", 50.00, 20.00, 25.00, "1");
        Fruit fruit1 = new Fruit("Apple", "yellow", true, "Kg", 100.00, 15.00, 20.00, "2");

        fruitService.saveOrUpdate(fruit);
        fruitService.saveOrUpdate(fruit1) ;

    }
}