package com.wrw.newmanagementsystem.org.dao;

import org.springframework.data.jpa.repository.Query;

import com.wrw.newmanagementsystem.common.dao.CommonDao;
import com.wrw.newmanagementsystem.org.entity.Role;

/**
 * @author wrw
 *
 */
public interface RoleDao extends RoleCustomDao,CommonDao<Role,String>{

	@Query("from Role r where r.roleName = ?1 ")
	public Role findByRoleName(String roleName);
}
