package com.wrw.newmanagementsystem.org.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import com.wrw.newmanagementsystem.common.dao.CustomBaseSqlDaoImpl;
import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmanagementsystem.org.dao.RoleCustomDao;
import com.wrw.newmanagementsystem.org.dto.RoleQueryDTO;
import com.wrw.newmanagementsystem.org.entity.Role;

public class RoleDaoImpl extends CustomBaseSqlDaoImpl implements RoleCustomDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> findRoles(Map<String, Object> params) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("select r from Role r ");
		
		if(params != null){
			StringBuilder sbWhere = new StringBuilder();
			Object name = params.get("name");
			if(name != null){
				sbWhere.append(" and r.name like :name ");
			}
			
			Object deleteFlag = params.get("deleteFlag");
			if(deleteFlag != null){
				sbWhere.append(" and r.deleteFlag = :deleteFlag ");
			}
			
			sb.append(sbWhere.toString().replaceFirst("and", "where"));
		}
		
		sb.append("order by r.no");
		
		return this.queryByMapParams(sb.toString(), params);
	}
	
	//根据查询条件查询角色分页信息
	@Override
	public PageModel<Role> queryRolePage(RoleQueryDTO roleQueryDTO) {
		Map<String,Object> params = new HashMap<String,Object>();
		StringBuilder hql = new StringBuilder();
		hql.append(" select r from Role r where 1=1 ");
		if(StringUtils.isNotBlank(roleQueryDTO.getName())){
			hql.append(" and r.name like :name ");
			params.put("name", "%"+roleQueryDTO.getName()+"%");
		}
		
		if(roleQueryDTO.getStatus() != null){
			hql.append(" and r.status = :status ");
			params.put("status", roleQueryDTO.getStatus());
		}
		hql.append(" order by r.createDate desc ");
		return this.queryForPageWithParams(hql.toString(), params, roleQueryDTO.getCurrentPage(), roleQueryDTO.getPageSize());
	}

}
