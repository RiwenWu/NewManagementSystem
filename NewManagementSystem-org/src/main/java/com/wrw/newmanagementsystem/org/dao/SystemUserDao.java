package com.wrw.newmanagementsystem.org.dao;

import java.util.List;
import java.util.Map;

import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmanagementsystem.org.dto.UserQueryDTO;
import com.wrw.newmanagementsystem.org.entity.User;

/**
 * @author wrw
 * 
 */
public interface SystemUserDao {

	public List<User> findUsers(Map<String, Object> params);
	
	/**
	 * 根据用户信息查询分页信息
	 * @param userQueryDTO
	 * @return
	 */
	PageModel<User> queryUserPage(UserQueryDTO userQueryDTO);
}
