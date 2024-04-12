package org.example.utility;

import org.example.connection.SessionFactorySingleton;
import org.example.repository.cart.CartRepository;
import org.example.repository.cart.CartRepositoryImpel;
import org.example.repository.customer.CustomerRepository;
import org.example.repository.customer.CustomerRepositoryImpl;
import org.example.repository.fruit.FruitRepository;
import org.example.repository.fruit.FruitRepositoryImpel;
import org.example.service.cart.CartService;
import org.example.service.cart.CartServiceImpel;
import org.example.service.customer.CustomerService;
import org.example.service.customer.CustomerServiceImpl;
import org.example.service.fruit.FruitService;
import org.example.service.fruit.FruitServiceImpel;
import org.hibernate.SessionFactory;

public class ApplicationContext {
    private final static SessionFactory SESSION_FACTORY;
    private final static CustomerRepository CUSTOMER_REPOSITORY;
    private final static FruitRepository FRUIT_REPOSITORY;
    private final static CartRepository CART_REPOSITORY;


    private final static CustomerService CUSTOMER_SERVICE;
    private final static FruitService FRUIT_SERVICE;
    private final static CartService CART_SERVICE;

    static {
        SESSION_FACTORY = SessionFactorySingleton.getInstance();


        CUSTOMER_REPOSITORY = new CustomerRepositoryImpl(SESSION_FACTORY);
        CUSTOMER_SERVICE = new CustomerServiceImpl(CUSTOMER_REPOSITORY, SESSION_FACTORY);


        CART_REPOSITORY = new CartRepositoryImpel(SESSION_FACTORY);
        CART_SERVICE = new CartServiceImpel(CART_REPOSITORY, SESSION_FACTORY);

        FRUIT_REPOSITORY = new FruitRepositoryImpel(SESSION_FACTORY);
        FRUIT_SERVICE = new FruitServiceImpel(FRUIT_REPOSITORY, SESSION_FACTORY);
    }

    public static CustomerService getCustomerService() {
        return CUSTOMER_SERVICE;
    }

    public static FruitService getFruitService() {
        return FRUIT_SERVICE;
    }

    public static CartService getCartService() {
        return CART_SERVICE;
    }
}

