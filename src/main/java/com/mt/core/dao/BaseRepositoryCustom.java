package com.mt.core.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * Created by shaojia on 2017/7/13.
 */

public interface BaseRepositoryCustom<T, ID extends Serializable> {

    public Page<T> findAll(final Pageable pageable, List filters);

    public List<T> findAll(List filters);

}

