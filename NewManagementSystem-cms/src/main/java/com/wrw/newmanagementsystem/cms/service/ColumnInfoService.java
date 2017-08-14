package com.wrw.newmanagementsystem.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrw.newmanagementsystem.cms.dao.ColumnInfoDao;
import com.wrw.newmanagementsystem.cms.dto.ColumnInfoQueryDTO;
import com.wrw.newmanagementsystem.cms.entity.ColumnInfo;
import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmanagementsystem.common.service.CommonService;

@Service("columnInfoService")
public class ColumnInfoService extends CommonService<ColumnInfo, String> {

	@Autowired
	private ColumnInfoDao columnInfoDao;

	@Autowired
	public void setColumnInfoDao(ColumnInfoDao columnInfoDao) {
		super.setCommonDao(columnInfoDao);
	}

	public PageModel<ColumnInfo> queryColumnInfoPage(ColumnInfoQueryDTO columnInfoQueryDTO) {
		return this.columnInfoDao.queryColumnInfoPage(columnInfoQueryDTO);
	}

	public List<ColumnInfo> queryColumnInfoList(ColumnInfoQueryDTO columnInfoQueryDTO) {
		return this.columnInfoDao.queryColumnInfoList(columnInfoQueryDTO);
	}

}
