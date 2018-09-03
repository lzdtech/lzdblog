package com.lzdtech.service.impl;

import java.util.List;

import com.lzdtech.bean.AdminUser;
import com.lzdtech.respository.AdminUserRespository;
import com.lzdtech.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


/**
 * @author 27901
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

	@Autowired
	private AdminUserRespository adminUserRespository;

	/**
	 * 查询所有管理员
	 * 
	 * @return
	 */
	@Override
	public List<AdminUser> getAdminUserList() {
		return adminUserRespository.findAll();
	}

	/**
	 * 查询管理员账号
	 * 
	 * @param name
	 * @return
	 */
	@Override
	public AdminUser findAdminUserByName(String name) {
		return adminUserRespository.findAdminUserByName(name);
	}

	/**
	 * 查询管理员密码
	 * 
	 * @param pwd
	 * @return
	 */
	@Override
	public AdminUser findAdminUserByPwd(String pwd) {
		return adminUserRespository.findAdminUserByPwd(pwd);
	}

	/**
	 * 保存添加的管理员账号和密码
	 * 
	 * @param adminUser
	 */
	@Override
	public void save(AdminUser adminUser) {
		adminUserRespository.save(adminUser);
	}

	/**
	 * 更新管理员的信息
	 * 
	 * @param adminUser
	 */
	@Override
	public void update(AdminUser adminUser) {
		adminUserRespository.save(adminUser);
	}

	/**
	 * 查询管理员ID
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public AdminUser findById(long id) {
		return adminUserRespository.findById(id);
	}

	/**
	 * 通过ID删除管理员
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public AdminUser delete(long id) {
		return adminUserRespository.deleteById(id);
	}

	@Override
	public Page<AdminUser> page(Integer page, Integer size) {
		Sort sort = new Sort(Direction.DESC, "id");
		@SuppressWarnings("deprecation")
		Pageable pageable = new PageRequest(page, size, sort);
		return adminUserRespository.findAll(pageable);
	}

}
