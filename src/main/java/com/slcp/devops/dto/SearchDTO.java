package com.slcp.devops.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Slcp
 * @date: 2020/9/22 13:26
 * @code: 一生的挚爱
 * @description: 搜索博客管理列表
 */
@Data
public class SearchDTO implements Serializable {
    private static final long serialVersionUID = -1129782578272943999L;
    private String title;
    private Long typeId;
}
