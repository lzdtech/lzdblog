package com.lzdtech.respository;

import com.lzdtech.bean.LzdLink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LzdLinkRespository extends JpaRepository<LzdLink,Integer> {
    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    LzdLink findById(long id);
}
