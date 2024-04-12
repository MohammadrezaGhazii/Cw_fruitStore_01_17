package org.example;

import org.example.connection.SessionFactorySingleton;
import org.example.model.Cart;
import org.example.model.Customer;
import org.example.model.Fruit;
import org.example.service.cart.CartService;
import org.example.service.customer.CustomerService;
import org.example.service.fruit.FruitService;
import org.example.utility.ApplicationContext;
import org.hibernate.SessionFactory;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService = ApplicationContext.getCustomerService();
//        Customer customer = new Customer("mohammad", "ahmadi", "09121111111",
//                "address", "0021212121", "AA12345");
//
//        customerService.saveOrUpdate(customer);

//        SessionFactory instance = SessionFactorySingleton.getInstance();

        FruitService fruitService = ApplicationContext.getFruitService();
//        Fruit fruit = new Fruit("Apple", "REd", true, "Kg", 50.00, 20.00, 25.00, "1");
//        Fruit fruit1 = new Fruit("Apple", "yellow", true, "Kg", 100.00, 15.00, 20.00, "2");
//
//        fruitService.saveOrUpdate(fruit);
//        fruitService.saveOrUpdate(fruit1) ;

        CartService cartService = ApplicationContext.getCartService();
        Cart cart = new Cart(50.00);


        Optional<Customer> foundCustomer = customerService.findById(1L);

        Customer customer = foundCustomer.get();
        Fruit fruit = fruitService.findById(1L).get();

      //  customer.setCarts();

//        customer.addCart(cart);
//
//
//        //    cartService.saveOrUpdate(cart);
//
//        customerService.saveOrUpdate(customer);
//
//
//        fruit.addCart(cart);
//
//        fruitService.saveOrUpdate(fruit);


    }
}