package com.lzdtech.respository;

import com.lzdtech.bean.SysConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;


/**
 * 系统配置JpaRepository 操作数据库方法
 * 
 * @author 27901
 */
public interface SystemConfigRespository
		extends JpaRepository<SysConfig, Long>, JpaSpecificationExecutor<SysConfig>, Serializable {

	SysConfig findById(long id);
}