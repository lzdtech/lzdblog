package com.lzdtech.respository;

import com.lzdtech.bean.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;


/**
 * 管理员JpaRepository 操作数据库方法
 * 
 * @author 27901
 */
public interface AdminUserRespository
		extends JpaRepository<AdminUser, Long>, JpaSpecificationExecutor<AdminUser>, Serializable {

	/**
	 * 查询管理员用户账号
	 * 
	 * @param name
	 * @return
	 */
	AdminUser findAdminUserByName(String name);

	/**
	 * 查询管理员用户密码
	 * 
	 * @param pwd
	 * @return
	 */
	AdminUser findAdminUserByPwd(String pwd);

	/**
	 * 查询ID
	 * 
	 * @param id
	 * @return
	 */
	AdminUser findById(long id);

	/**
	 * 通过ID删除管理员
	 * 
	 * @param id
	 * @return
	 */
	AdminUser deleteById(long id);

}