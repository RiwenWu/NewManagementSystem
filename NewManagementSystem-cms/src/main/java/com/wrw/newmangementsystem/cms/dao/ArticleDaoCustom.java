package com.wrw.newmangementsystem.cms.dao;

import java.util.List;
import java.util.Map;

import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmangementsystem.cms.dto.ArticleQueryDTO;
import com.wrw.newmangementsystem.cms.dto.CurrentArticleInfoDTO;
import com.wrw.newmangementsystem.cms.entity.Article;

public interface ArticleDaoCustom {

	PageModel<Article> queryArticlePage(ArticleQueryDTO articleQueryDTO);
	
	List<Article> queryArticleList(ArticleQueryDTO articleQueryDTO);
	
	List<Map<String, Object>> queryStatisMapList(ArticleQueryDTO articleQueryDTO);
	
	//查询下一篇文章
	List<Article> queryNextArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);
	
	//查询上一篇文章
	List<Article> queryPreArticleList(CurrentArticleInfoDTO currentArticleInfoDTO);
}
