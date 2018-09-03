package com.lzdtech.service;

import com.lzdtech.bean.LzdArticle;
import org.springframework.data.domain.Page;

public interface LzdArticleService {

	/**
	 * 分页查询功能
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	Page<LzdArticle> page(Integer page, Integer size);

	/**
	 * 保存文章信息
	 * 
	 * @param lzdArticle
	 */
	void save(LzdArticle lzdArticle);

	/**
	 * 更新文章信息
	 * 
	 * @param lzdArticle
	 */
	void update(LzdArticle lzdArticle);

	/**
	 * 通过ID查询文章
	 * 
	 * @param id
	 * @return
	 */
	LzdArticle findById(long id);

	/**
	 * 通过ID删除文章
	 * 
	 * @param id
	 * @return
	 */
	LzdArticle delete(long id);

}
