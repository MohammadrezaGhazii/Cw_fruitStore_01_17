package org.example.repository.cart;

import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Cart;
import org.hibernate.SessionFactory;

public class CartRepositoryImpel extends BaseRepositoryImpl<Cart, Long> implements CartRepository {
    public CartRepositoryImpel(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Cart> getEntityClass() {
        return Cart.class;
    }

    @Override
    public String getEntity() {
        return "Cart";
    }
}
