package com.wrw.newmangementsystem.cms.dao;

import java.util.List;

import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmangementsystem.cms.dto.ColumnInfoQueryDTO;
import com.wrw.newmangementsystem.cms.entity.ColumnInfo;


public interface ColumnInfoDaoCustom {

	PageModel<ColumnInfo> queryColumnInfoPage(ColumnInfoQueryDTO columnInfoQueryDTO);

    List<ColumnInfo> queryColumnInfoList(ColumnInfoQueryDTO columnInfoQueryDTO);


}
