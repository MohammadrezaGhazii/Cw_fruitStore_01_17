package org.example.repository.fruit;

import org.example.base.repository.BaseRepository;
import org.example.base.repository.BaseRepositoryImpl;
import org.example.model.Fruit;
import org.hibernate.SessionFactory;

public class FruitRepositoryImpel extends BaseRepositoryImpl<Fruit, Long> implements FruitRepository {


    public FruitRepositoryImpel(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public Class<Fruit> getEntityClass() {
        return Fruit.class;
    }

    @Override
    public String getEntity() {
        return "Fruit";
    }
}
