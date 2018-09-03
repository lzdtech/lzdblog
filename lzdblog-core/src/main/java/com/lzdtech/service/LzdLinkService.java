package com.lzdtech.service;

import com.lzdtech.bean.LzdLink;
import org.springframework.data.domain.Page;

import java.util.List;

public interface LzdLinkService {

    /**
     * 通过ID查询友情连接
     *
     * @return
     */
    List<LzdLink> getLzdLinkAll();


    /**
     * 分页查询功能
     *
     * @param page
     * @param size
     * @return
     */
    Page<LzdLink> page(Integer page, Integer size);

}
