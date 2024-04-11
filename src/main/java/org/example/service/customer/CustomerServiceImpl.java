package org.example.service.customer;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Customer;
import org.example.repository.customer.CustomerRepository;
import org.hibernate.SessionFactory;

public class CustomerServiceImpl extends BaseServiceImpl<Customer , Long , CustomerRepository>
        implements CustomerService{
    public CustomerServiceImpl(CustomerRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
