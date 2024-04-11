package org.example.repository.customer;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Customer;
import org.hibernate.SessionFactory;

public class CustomerRepositoryImpl extends BaseRepositoryImpl<Customer , Long>
        implements CustomerRepository{
    public CustomerRepositoryImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Customer> getEntityClass() {
        return Customer.class;
    }

    @Override
    public String getEntity() {
        return "Customer";
    }
}
