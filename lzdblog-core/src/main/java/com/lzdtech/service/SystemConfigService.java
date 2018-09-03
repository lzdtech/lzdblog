package com.lzdtech.service;

import com.lzdtech.bean.SysConfig;

import java.util.List;

/**
 * 系统配置Service
 * 
 * @author 27901
 */
public interface SystemConfigService {

	/**
	 * 保存配置
	 * 
	 * @param sc
	 */
	void save(SysConfig sc);

	/**
	 * 获取系统配置所有数据
	 * 
	 * @return
	 */
	List<SysConfig> getSysConfigList();

	SysConfig findById(long id);

}
