package com.wrw.newmanagementsystem.cms.dao;

import java.util.List;
import java.util.Map;

import com.wrw.newmanagementsystem.cms.dto.ArticleQueryDTO;
import com.wrw.newmanagementsystem.cms.dto.CurrentArticleInfoDTO;
import com.wrw.newmanagementsystem.cms.entity.Article;
import com.wrw.newmanagementsystem.common.entity.PageModel;

public interface ArticleDaoCustom {

	PageModel<Article> queryArticlePage(ArticleQueryDTO articleQueryDTO);
	
	List<Article> queryArticleList(ArticleQueryDTO articleQueryDTO);
	
	List<Map<String, Object>> queryStatisMapList(ArticleQueryDTO articleQueryDTO);
	
	//查询下一篇文章
	List<Article> queryNextArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);
	
	//查询上一篇文章
	List<Article> queryPreArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);
}
