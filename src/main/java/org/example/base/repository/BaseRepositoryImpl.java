package org.example.base.repository;

import jakarta.persistence.Id;
import org.example.base.entity.BaseEntity;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.net.IDN;
import java.util.List;
import java.util.Optional;

public abstract class BaseRepositoryImpl<T extends BaseEntity<ID>, ID extends Serializable> implements BaseRepository<T, ID> {

    protected Session session;

    @Override
    public T saveOrUpdate(T entity) {
        beginTransaction();
        persistOrMerge(entity);
        commitTransaction();
        session.close();
        return entity;
    }

    private void persistOrMerge(T entity) {
        if (entity.getId() == null)
            session.persist(entity);
        else
            session.merge(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(session.get(getEntityClass(), id));
    }

    public abstract Class<T> getEntityClass();

    @Override
    public void delete(T entity) {
        beginTransaction();
        session.remove(entity);
    }

    @Override
    public List<T> findAll() {
        beginTransaction();
        Query<T> query = session.createQuery(String.format("from %s", getEntity()), getEntityClass());
        List<T> resultList = query.getResultList();
        return resultList;
    }

    public abstract T getEntity();

    @Override
    public void beginTransaction() {
        if (!session.getTransaction().isActive())
            session.beginTransaction();
    }

    @Override
    public void commitTransaction() {

    }

    @Override
    public void rollBack() {

    }
}
