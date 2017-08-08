package com.wrw.newmangementsystem.cms.dao.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.wrw.newmanagementsystem.common.dao.CustomBaseSqlDaoImpl;
import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmangementsystem.cms.dao.ArticleDaoCustom;
import com.wrw.newmangementsystem.cms.dto.ArticleQueryDTO;
import com.wrw.newmangementsystem.cms.dto.CurrentArticleInfoDTO;
import com.wrw.newmangementsystem.cms.entity.Article;

public class ArticleDaoImpl extends CustomBaseSqlDaoImpl implements ArticleDaoCustom {

	@Override
	public PageModel<Article> queryArticlePage(ArticleQueryDTO articleQueryDTO) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Map<String, Object> map = new HashMap<String, Object>();
		StringBuilder hql = new StringBuilder();
		hql.append("select t from Article t where 1=1 ");
		
		if (articleQueryDTO != null) {
			
			if (StringUtils.isNotBlank(articleQueryDTO.getRootColumnId())) {
				hql.append(" and t.rootColumnInfo.id = :rootColumnId ");
				map.put("rootColumnId", articleQueryDTO.getRootColumnId());
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getColumnId())) {
				hql.append(" and t.columnInfo.id = :columnId ");
				map.put("columnId", articleQueryDTO.getColumnId());
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getTitle())) {
				hql.append(" and t.title like  :title ");
				map.put("title", "%" + articleQueryDTO.getTitle() + "%");
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getPublisher())) {
				hql.append(" and t.publisher like  :publisher ");
				map.put("publisher", "%" + articleQueryDTO.getPublisher() + "%");
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getDeleteFlag())) {
				hql.append(" and t.deleteFlag = :deleteFlag ");
				map.put("deleteFlag", articleQueryDTO.getDeleteFlag());
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getStartDate())) {
				hql.append(" and t.createDate  >= :startDate ");
				try {
					map.put("startDate", sdf.parse(articleQueryDTO.getStartDate()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getEndDate())) {
				hql.append(" and t.createDate  <= :endDate ");
				try {
					map.put("endDate", sdf.parse(articleQueryDTO.getEndDate()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (StringUtils.isNotBlank(articleQueryDTO.getType())) {
				if (articleQueryDTO.getType().equals("laji")) {
					hql.append(" and t.deleteFlag =1 ");
				} else if (articleQueryDTO.getType().equals("shenhe")) {
					hql.append(" and t.isAudit =1 ");
				} else if (articleQueryDTO.getType().equals("zhiding")) {
					hql.append(" and t.isTop =1 ");
				}
			}
		}
		hql.append(" order by t.createDate desc ");
		return this.queryForPageWithParams(
				hql.toString(), 
				map, articleQueryDTO.getCurrentPage(),
				articleQueryDTO.getPageSize());
	}

	@Override
	public List<Article> queryArticleList(ArticleQueryDTO articleQueryDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> queryStatisMapList(ArticleQueryDTO articleQueryDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> queryNextArticleList(CurrentArticleInfoDTO currentArticleInfoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> queryPreArticleList(CurrentArticleInfoDTO currentArticleInfoDTO) {
		// TODO Auto-generated method stub
		return null;
	}

}
