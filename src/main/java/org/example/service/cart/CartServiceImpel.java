package org.example.service.cart;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Cart;
import org.example.repository.cart.CartRepository;
import org.hibernate.SessionFactory;

public class CartServiceImpel extends BaseServiceImpl<Cart, Long, CartRepository> implements CartService {
    public CartServiceImpel(CartRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
