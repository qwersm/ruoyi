package com.ruoyi.knowledge.service;

import com.ruoyi.knowledge.domain.Article;
import java.util.List;

/**
 * 文章 服务层
 * 
 * @author ruoyi
 * @date 2019-05-05
 */
public interface IArticleService 
{
	/**
     * 查询文章信息
     * 
     * @param id 文章ID
     * @return 文章信息
     */
	public Article selectArticleById(String id);
	
	/**
     * 查询文章列表
     * 
     * @param article 文章信息
     * @return 文章集合
     */
	public List<Article> selectArticleList(Article article);
	
	/**
     * 新增文章
     * 
     * @param article 文章信息
     * @return 结果
     */
	public int insertArticle(Article article);
	
	/**
     * 修改文章
     * 
     * @param article 文章信息
     * @return 结果
     */
	public int updateArticle(Article article);
		
	/**
     * 删除文章信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteArticleByIds(String ids);

    String importArticle(List<Article> articleList, boolean updateSupport, String operName);
}
