package com.wrw.newmanagementsystem.org.dao;

import java.util.List;
import java.util.Map;

import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmanagementsystem.org.dto.RoleQueryDTO;
import com.wrw.newmanagementsystem.org.entity.Role;

/**
 * @author wrw
 *
 */
public interface RoleCustomDao {
	
	public List<Role> findRoles(Map<String, Object> params);
	
	/**
	 * 根据查询条件查询角色分页信息
	 * @param userQueryDTO
	 * @return
	 */
	PageModel<Role> queryRolePage(RoleQueryDTO roleQueryDTO);
}
