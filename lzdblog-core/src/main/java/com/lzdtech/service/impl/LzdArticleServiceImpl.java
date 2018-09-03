package com.lzdtech.service.impl;

import com.lzdtech.bean.LzdArticle;
import com.lzdtech.respository.LzdArticleRespository;
import com.lzdtech.service.LzdArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class LzdArticleServiceImpl implements LzdArticleService {

	@Autowired
	private LzdArticleRespository lzdArticleRespository;

	/**
	 * 查询所有文章，并分页
	 */
	@Override
	public Page<LzdArticle> page(Integer page, Integer size) {
		Sort sort = new Sort(Direction.DESC, "id");
		@SuppressWarnings("deprecation")
		Pageable pageable = new PageRequest(page, size, sort);
		return lzdArticleRespository.findAll(pageable);
	}

	/**
	 * 保存文章信息
	 * 
	 * @param lzdArticle
	 */
	@Override
	public void save(LzdArticle lzdArticle) {
		lzdArticleRespository.save(lzdArticle);
	}

	/**
	 * 保存文章信息
	 */
	@Override
	public void update(LzdArticle lzdArticle) {
		lzdArticleRespository.save(lzdArticle);
	}

	@Override
	public LzdArticle findById(long id) {
		// TODO Auto-generated method stub
		return lzdArticleRespository.findById(id);
	}

	@Override
	public LzdArticle delete(long id) {
		// TODO Auto-generated method stub
		return lzdArticleRespository.deleteById(id);
	}

}
