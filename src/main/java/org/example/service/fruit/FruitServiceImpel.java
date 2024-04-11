package org.example.service.fruit;

import org.example.base.service.BaseServiceImpl;
import org.example.model.Fruit;
import org.example.repository.fruit.FruitRepository;
import org.hibernate.SessionFactory;

public class FruitServiceImpel extends BaseServiceImpl<Fruit, Long, FruitRepository> implements FruitService {
    public FruitServiceImpel(FruitRepository repository, SessionFactory sessionFactory) {
        super(repository, sessionFactory);
    }
}
