package com.lzdtech.service.impl;

import com.lzdtech.bean.SysConfig;
import com.lzdtech.respository.SystemConfigRespository;
import com.lzdtech.service.SystemConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysConfigService implements SystemConfigService {

	@Autowired
	private SystemConfigRespository systemConfigRespository;

	@Override
	public void save(SysConfig sc) {
		systemConfigRespository.save(sc);
	}

	/**
	 * 查询系统配置信息
	 * 
	 * @return
	 */
	@Override
	public List<SysConfig> getSysConfigList() {
		return systemConfigRespository.findAll();
	}

	@Override
	public SysConfig findById(long id) {
		return systemConfigRespository.findById(id);
	}

}
