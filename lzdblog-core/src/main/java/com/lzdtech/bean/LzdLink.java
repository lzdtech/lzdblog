package com.lzdtech.bean;

import javax.persistence.*;

@Entity
@Table(name = "lzd_link")
public class LzdLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     *  网站名称
     */
    private String webname;
    /**
     *  网站地址
     */
    private String weburl;
    /**
     *  网站Logo
     */
    private String weblogo;
    /**
     *  网站是否启用
     */
    private int webopen;

}
