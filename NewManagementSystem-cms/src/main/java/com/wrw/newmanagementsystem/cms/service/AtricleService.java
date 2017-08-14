package com.wrw.newmanagementsystem.cms.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wrw.newmanagementsystem.cms.dao.ArticleDao;
import com.wrw.newmanagementsystem.cms.dto.ArticleQueryDTO;
import com.wrw.newmanagementsystem.cms.dto.CurrentArticleInfoDTO;
import com.wrw.newmanagementsystem.cms.entity.Article;
import com.wrw.newmanagementsystem.common.entity.PageModel;
import com.wrw.newmanagementsystem.common.service.CommonService;

@Service
public class AtricleService extends CommonService<Article, String> {

	@Autowired
	private ArticleDao articleDao;

	@Autowired
	public void setArticleDao(ArticleDao articleDao) {
		super.setCommonDao(articleDao);
	}

	public PageModel<Article> queryArticlePage(ArticleQueryDTO articleQueryDTO) {
		return this.articleDao.queryArticlePage(articleQueryDTO);
	}

	public List<Article> queryArticleList(ArticleQueryDTO articleQueryDTO) {
		return this.articleDao.queryArticleList(articleQueryDTO);
	}

	public List<Map<String, Object>> queryStatisMapList(ArticleQueryDTO articleQueryDTO) {
		return this.articleDao.queryStatisMapList(articleQueryDTO);
	}

	public Article queryNextArticle(CurrentArticleInfoDTO currentArticleInfoDTO) {
		Article article = null;
		List<Article> articleList = this.articleDao.queryNextArticleList(currentArticleInfoDTO);
		if (articleList != null && articleList.size() > 0) {
			article = articleList.get(0);
		}
		return article;
	}

	public Article queryPreArticle(CurrentArticleInfoDTO currentArticleInfoDTO) {
		Article article = null;
		List<Article> articleList = this.articleDao.queryPreArticleList(currentArticleInfoDTO);
		if (articleList != null && articleList.size() > 0) {
			article = articleList.get(0);
		}
		return article;
	}
}
