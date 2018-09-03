package com.lzdtech.service.impl;

import com.lzdtech.bean.LzdLink;
import com.lzdtech.respository.LzdLinkRespository;
import com.lzdtech.service.LzdLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzdtech
 */
@Service
public class LzdLinkServiceImpl implements LzdLinkService {

    @Autowired
    private LzdLinkRespository lzdLinkRespository;

    /**
     * 通过ID查询友情连接
     *
     * @return
     */
    @Override
    public List <LzdLink> getLzdLinkAll() {
        return null;
    }

    /**
     * 分页查询功能
     *
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page <LzdLink> page(Integer page, Integer size) {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        @SuppressWarnings("deprecation")
        Pageable pageable = new PageRequest(page, size, sort);
        return lzdLinkRespository.findAll(pageable);
    }
}
