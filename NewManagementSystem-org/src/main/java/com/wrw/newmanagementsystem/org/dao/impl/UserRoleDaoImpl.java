package com.wrw.newmanagementsystem.org.dao.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.wrw.newmanagementsystem.common.dao.CustomBaseSqlDaoImpl;
import com.wrw.newmanagementsystem.org.dao.UserRoleRelCustomDao;
import com.wrw.newmanagementsystem.org.entity.User;

public class UserRoleDaoImpl extends CustomBaseSqlDaoImpl implements UserRoleRelCustomDao{

	//根据角色ID和用户名查找用户
	@Override
	public List<User> findUserListByRoleCondition(String roleId, String name) {
		String hql="select urr.user from UserRoleRel urr where 1=1 ";
		if(roleId != null){
			hql+=" and urr.role.id = "+roleId;
		}
		if(StringUtils.isNotBlank(name)){
			hql+=" and urr.user.realName like '%"+name+"%' ";
		}
		return this.queryForList(hql);
	}

}
