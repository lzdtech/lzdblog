package com.lzdtech.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lzd_article")
public class LzdArticle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// 文章标题
	private String articletitile;

	// 日期
	private String datetime;
	// 封面
	private String cover;
	// 作者
	private String author;
	// 文章简介
	private String articlebrief;
	// 文章内容
	private String articlecontent;
	// 文章背景图片
	private String articlebg;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getArticletitile() {
		return articletitile;
	}

	public void setArticletitile(String articletitile) {
		this.articletitile = articletitile;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getArticlebrief() {
		return articlebrief;
	}

	public void setArticlebrief(String articlebrief) {
		this.articlebrief = articlebrief;
	}

	public String getArticlecontent() {
		return articlecontent;
	}

	public void setArticlecontent(String articlecontent) {
		this.articlecontent = articlecontent;
	}

	public String getArticlebg() {
		return articlebg;
	}

	public void setArticlebg(String articlebg) {
		this.articlebg = articlebg;
	}

	@Override
	public String toString() {
		return "LzdArticle [id=" + id + ", articletitile=" + articletitile + ", datetime=" + datetime + ", cover="
				+ cover + ", author=" + author + ", articlebrief=" + articlebrief + ", articlecontent=" + articlecontent
				+ ", articlebg=" + articlebg + "]";
	}

}
