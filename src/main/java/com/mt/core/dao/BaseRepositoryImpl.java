package com.mt.core.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

/**
 * Created by shaojia on 2017/7/13.
 */
@Repository(value = "baseRepository")
public class BaseRepositoryImpl<T, ID extends Serializable> implements BaseRepositoryCustom<T, ID> {

    @PersistenceContext
    private EntityManager em;

    public EntityManager getEntityManager() {
        return this.em;
    }
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Page<T> findAll(Pageable pageable, List filters) {

        return null;
    }

    @Override
    public List<T> findAll(List filters) {
        return null;
    }

}
