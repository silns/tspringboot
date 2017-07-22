package com.mt.core.service.sys;

import com.mt.core.dao.BaseRepository;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by shaojia on 2017/7/17.
 */
public abstract class CoreService<T, PK extends Serializable> {

    public void save(T entity) {
        if(beforeSave(entity))
            save(entity, true);
    }

    /**
     * type为true时为新增，false时为更新
     * @param entity
     * @param type
     */
    public void save(T entity, boolean type) {
        getDao().save(entity);
    }



    public void delete(PK id) {
        getDao().delete(id);
    }

    public void delete(T entity) {
        getDao().delete(entity);
    }

    public void delete(PK[] ids) {
        for(PK id : ids) {
            delete(id);
        }
    }

    public void delete(T[] entities) {
        for(T entity : entities) {
            delete(entity);
        }
    }

    public void delete(Collection<T> entities) {
        for(T entity : entities) {
            delete(entity);
        }
    }

    public T get(PK id) {
        return getDao().findOne(id);
    }

    public boolean exist(PK id) {
        return get(id) != null;
    }


    protected abstract BaseRepository<T, PK> getDao();

    protected abstract boolean beforeSave(T entity);
}
