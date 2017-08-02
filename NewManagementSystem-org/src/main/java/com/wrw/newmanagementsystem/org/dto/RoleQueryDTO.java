package com.wrw.newmanagementsystem.org.dto;

import com.wrw.newmanagementsystem.common.dto.CommonQueryDTO;

public class RoleQueryDTO extends CommonQueryDTO{

	//名称
	private String name;
		
	//状态
	private Integer status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
