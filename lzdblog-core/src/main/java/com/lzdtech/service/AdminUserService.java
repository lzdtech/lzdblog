package com.lzdtech.service;

import com.lzdtech.bean.AdminUser;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 管理员用户Service
 * 
 * @author 27901
 */
public interface AdminUserService {

	/**
	 * 获取管理员用户所有数据
	 * 
	 * @return
	 */
	List<AdminUser> getAdminUserList();

	/**
	 * 查询管理用户账号
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
	 * 保存管理员用户数据
	 * 
	 * @param adminUser
	 */
	void save(AdminUser adminUser);

	/**
	 * 更新管理员账号数据
	 * 
	 * @param adminUser
	 */
	void update(AdminUser adminUser);

	/**
	 * 查询管理员用户ID
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
	AdminUser delete(long id);

	/**
	 * 分页查询功能
	 * 
	 * @param page
	 * @param size
	 * @return
	 */
	Page<AdminUser> page(Integer page, Integer size);
}
