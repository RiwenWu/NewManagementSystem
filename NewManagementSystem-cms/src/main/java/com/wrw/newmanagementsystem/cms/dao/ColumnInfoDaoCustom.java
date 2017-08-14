package com.wrw.newmanagementsystem.cms.dao;

import java.util.List;

import com.wrw.newmanagementsystem.cms.dto.ColumnInfoQueryDTO;
import com.wrw.newmanagementsystem.cms.entity.ColumnInfo;
import com.wrw.newmanagementsystem.common.entity.PageModel;


public interface ColumnInfoDaoCustom {

	PageModel<ColumnInfo> queryColumnInfoPage(ColumnInfoQueryDTO columnInfoQueryDTO);

    List<ColumnInfo> queryColumnInfoList(ColumnInfoQueryDTO columnInfoQueryDTO);


}
