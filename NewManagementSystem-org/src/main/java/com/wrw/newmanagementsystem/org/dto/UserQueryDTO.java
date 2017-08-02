package com.wrw.newmanagementsystem.org.dto;

import com.wrw.newmanagementsystem.common.dto.CommonQueryDTO;


/**
 * @author wrw
 * 后台用户查询信息封装
 */
public class UserQueryDTO extends CommonQueryDTO{

	//账号
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
