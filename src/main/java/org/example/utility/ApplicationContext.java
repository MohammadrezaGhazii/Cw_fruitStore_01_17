package org.example.utility;

import org.example.connection.SessionFactorySingleton;
import org.example.repository.customer.CustomerRepository;
import org.example.repository.customer.CustomerRepositoryImpl;
import org.example.service.customer.CustomerService;
import org.example.service.customer.CustomerServiceImpl;
import org.hibernate.SessionFactory;

public class ApplicationContext {
    private final static SessionFactory SESSION_FACTORY;
    private final static CustomerRepository CUSTOMER_REPOSITORY;
    private final static CustomerService CUSTOMER_SERVICE;

    static {
        SESSION_FACTORY = SessionFactorySingleton.getInstance();
        CUSTOMER_REPOSITORY = new CustomerRepositoryImpl(SESSION_FACTORY);
        CUSTOMER_SERVICE = new CustomerServiceImpl(CUSTOMER_REPOSITORY,SESSION_FACTORY);
    }

    public static CustomerService getCustomerService(){
        return CUSTOMER_SERVICE;
    }

}
