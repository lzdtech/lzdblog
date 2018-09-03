package com.lzdtech.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户信息表
 * 
 * @author 27901
 *
 */
@Entity
@Table(name = "lzd_user")
public class LzdUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String username;
	private String password;
	private String userlogo;
	private String usercontext;
	private String userbirthday;
	private String userIdCard;
	private String useraddress;
	private String userphone;
	private String userqq;
	private String userweixin;
	private String usermail;

	public LzdUser() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserlogo() {
		return userlogo;
	}

	public void setUserlogo(String userlogo) {
		this.userlogo = userlogo;
	}

	public String getUsercontext() {
		return usercontext;
	}

	public void setUsercontext(String usercontext) {
		this.usercontext = usercontext;
	}

	public String getUserbirthday() {
		return userbirthday;
	}

	public void setUserbirthday(String userbirthday) {
		this.userbirthday = userbirthday;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUserqq() {
		return userqq;
	}

	public void setUserqq(String userqq) {
		this.userqq = userqq;
	}

	public String getUserweixin() {
		return userweixin;
	}

	public void setUserweixin(String userweixin) {
		this.userweixin = userweixin;
	}

	public String getUsermail() {
		return usermail;
	}

	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}

	@Override
	public String toString() {
		return "LzdUser [id=" + id + ", username=" + username + ", password=" + password + ", userlogo=" + userlogo
				+ ", usercontext=" + usercontext + ", userbirthday=" + userbirthday + ", userIdCard=" + userIdCard
				+ ", useraddress=" + useraddress + ", userphone=" + userphone + ", userqq=" + userqq + ", userweixin="
				+ userweixin + ", usermail=" + usermail + "]";
	}

}
