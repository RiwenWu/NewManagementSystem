package com.wrw.newmanagementsystem.common.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author wrw
 * Mysql数据库的主键生成定义
 * 系统自动生成32位不同的字符序列
 */

@MappedSuperclass
public class MySqlAutoStringIdEntity {

	protected String id;
	
	@Id
	@Column(length = 32, nullable = true)
	@GenericGenerator(name = "sys_uuid", strategy = "uuid")
	@GeneratedValue(generator = "sys_uuid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
