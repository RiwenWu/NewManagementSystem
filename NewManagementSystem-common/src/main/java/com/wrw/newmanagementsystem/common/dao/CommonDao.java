package com.wrw.newmanagementsystem.common.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;


/**
 * @author wrw
 * 基础Dao接口定义
 * @param <E>
 * @param <ID>
 */

@NoRepositoryBean
public interface CommonDao<E, ID extends Serializable> extends JpaRepository<E,ID>, JpaSpecificationExecutor<E> {

}
