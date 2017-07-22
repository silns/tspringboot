package com.mt.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by shaojia on 2017/7/13.
 */



public interface BaseRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, BaseRepositoryCustom<T, ID> {
}

