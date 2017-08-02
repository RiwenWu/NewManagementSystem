package com.wrw.newmanagementsystem.org.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.wrw.newmanagementsystem.common.dao.CustomBaseSqlDaoImpl;
import com.wrw.newmanagementsystem.org.dao.ResourceDaoCustom;
import com.wrw.newmanagementsystem.org.entity.Resource;

public class ResourceDaoImpl extends CustomBaseSqlDaoImpl implements ResourceDaoCustom {

	@SuppressWarnings("unchecked")
	@Override
	public List<Resource> findMenuResource(Map<String, Object> params) {
		StringBuilder sb = new StringBuilder();
		sb.append("select r from Resource r where r.type in('module', 'page') ");
		
		Object deleteFlag = params.get("deleteFlag");
		if(deleteFlag != null){
			sb.append(" and r.deleteFlag = :deleteFlag ");
		}

		Object name = params.get("name");
		if(name != null){
			sb.append(" and r.name like :name ");
		}
		
		sb.append(" order by r.orderNo ");
		
		return this.queryByMapParams(sb.toString(), params, null, null);
	}

}
