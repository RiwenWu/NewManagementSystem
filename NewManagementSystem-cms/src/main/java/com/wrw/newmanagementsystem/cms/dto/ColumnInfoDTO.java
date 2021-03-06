package com.wrw.newmanagementsystem.cms.dto;

import java.util.List;

public class ColumnInfoDTO {

	private String id;

	private String name;

	private List<ColumnInfoDTO> childColumnInfoList;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ColumnInfoDTO> getChildColumnInfoList() {
		return childColumnInfoList;
	}

	public void setChildColumnInfoList(List<ColumnInfoDTO> childColumnInfoList) {
		this.childColumnInfoList = childColumnInfoList;
	}
}
