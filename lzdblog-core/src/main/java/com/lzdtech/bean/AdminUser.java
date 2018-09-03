package com.lzdtech.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 管理员用户信息 通过Jpa得到管理用户表
 * 
 * @author 27901
 *
 */

@Entity
@Table(name = "admin_user")
public class AdminUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String pwd;

	public AdminUser() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "AdminUser{" + "id=" + id + ", name='" + name + '\'' + ", pwd='" + pwd + '\'' + '}';
	}
}
