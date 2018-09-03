package com.lzdtech.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 系统配置信息表
 * 
 * @author 27901
 *
 */
@Entity
@Table(name = "sys_config")
public class SysConfig {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String webtitle;
	// kw 网站的关键字
	private String webkeyword;
	// describe 网站描述
	private String webdescribe;
	// 网站版权
	private String webcopyright;
	private String weblogo;
	// 网站域名
	private String webdomain;

	public SysConfig() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getWebtitle() {
		return webtitle;
	}

	public void setWebtitle(String webtitle) {
		this.webtitle = webtitle;
	}

	public String getWebkeyword() {
		return webkeyword;
	}

	public void setWebkeyword(String webkeyword) {
		this.webkeyword = webkeyword;
	}

	public String getWebdescribe() {
		return webdescribe;
	}

	public void setWebdescribe(String webdescribe) {
		this.webdescribe = webdescribe;
	}

	public String getWebcopyright() {
		return webcopyright;
	}

	public void setWebcopyright(String webcopyright) {
		this.webcopyright = webcopyright;
	}

	public String getWeblogo() {
		return weblogo;
	}

	public void setWeblogo(String weblogo) {
		this.weblogo = weblogo;
	}

	public String getWebdomain() {
		return webdomain;
	}

	public void setWebdomain(String webdomain) {
		this.webdomain = webdomain;
	}

	@Override
	public String toString() {
		return "SystemConfig [id=" + id + ", webtitle=" + webtitle + ", webkeyword=" + webkeyword + ", webdescribe="
				+ webdescribe + ", webcopyright=" + webcopyright + ", weblogo=" + weblogo + ", webdomain=" + webdomain
				+ "]";
	}

}
