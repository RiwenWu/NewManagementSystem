package com.wrw.newmanagementsystem.org.dao;

import java.util.List;
import java.util.Map;

import com.wrw.newmanagementsystem.org.entity.Resource;


/**
 * @author wrw
 *
 */
public interface ResourceDaoCustom {
	
	public List<Resource> findMenuResource(Map<String, Object> params);
}
