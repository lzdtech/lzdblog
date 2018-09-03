package com.lzdtech.respository;

import com.lzdtech.bean.LzdArticle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LzdArticleRespository extends JpaRepository<LzdArticle, Long> {

	/**
	 * 根据ID删除
	 * 
	 * @param id
	 * @return
	 */
	LzdArticle deleteById(long id);

	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	LzdArticle findById(long id);

}